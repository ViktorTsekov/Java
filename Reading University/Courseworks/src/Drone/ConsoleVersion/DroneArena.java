package Drone.ConsoleVersion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class DroneArena {
	ConsoleCanvas canvas;
	List<Drone> droneList;
	
	private int row;
	private int col;
	
	private enum Direction {
        North,
        South,
        West,
        East;

        public static String getRandomDirection() {
            Random random = new Random();
            
            return values()[random.nextInt(values().length)].toString();
        }
        
    }
	
	DroneArena(int row, int col) {
		droneList = new ArrayList<Drone>();
		this.row = row;
		this.col = col;
		canvas = new ConsoleCanvas(row, col);
	}
		
	private void emptyArena() {
		
		for(int i = 0; i < droneList.size(); i++) {
			int x = droneList.get(i).getX();
			int y = droneList.get(i).getY();
			
			canvas.deleteSpace(x, y);
		}
		
	}
	
	private int findMaxId() {
		int maxID = 0;
		
		if(droneList.size() == 0) {
			return 0;
		}
		
		for(int i = 0; i < droneList.size(); i++) {
			Drone cur = droneList.get(i);
			
			if(maxID < cur.getID()) {
				maxID = cur.getID();
			}
			
		}
		
		return maxID + 1;
	}
	
	public void changeDimensions(int newX, int newY) {
		droneList.clear();
		row = newX;
		col = newY;
		canvas.changeCanvas(newX, newY);
		System.out.println("New arena created with dimensions: (" + newX + "x" + newY + ")");
	}
	
	public void saveArena() {	
		
		try {
			String str = "" + row + " " + col;
			PrintWriter dimensions = new PrintWriter("dimensions.txt");
			
			dimensions.print("");
			dimensions.print(str);
			
			dimensions.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public void readInformationFromFile(String fileName) {
		File myObj = new File(fileName);
	    Scanner myReader;
	    
	    if(myObj.length() == 0) {
	    	System.out.println("The file is empty or does not exist");
	    	return;
	    }
	    
	    System.out.println("Loading drones from file");
	    
		try {
			emptyArena();
			droneList.clear();
			myReader = new Scanner(myObj);
			
			while (myReader.hasNextLine()) {
		        String str = myReader.nextLine();
		        Drone drone = new Drone();
		        var data = Arrays.stream(str.split(" ")).collect(Collectors.toList());

		        drone.setX(Integer.parseInt(data.get(0)));
		        drone.setY(Integer.parseInt(data.get(1)));
		        drone.setID(Integer.parseInt(data.get(2)));

		        if(canvas.theSpaceIsClear(drone.getX(), drone.getY())) {
		        	System.out.println("Loading drone number " + data.get(2) + " at position " + "(" + data.get(0) + "," + data.get(1) + ")");
		        	droneList.add(drone);
		        }

		    }
			
		    myReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		canvas.projectDronesOnScreen(droneList);
	}
	
	public void saveInformationToFile(String fileName) {
		FileWriter myWriter;
		
		try {
			myWriter = new FileWriter(fileName);
			PrintWriter printWriter = new PrintWriter(myWriter);
			
			for(int i = 0; i < droneList.size(); i++) {
				String str = "";
				Drone cur = droneList.get(i);
				
				str += cur.getX() + " ";
				str += cur.getY() + " ";
				str += cur.getID();
				str += "\n";
				
				printWriter.print(str);
			}
			
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nData saved to file");
	}
	
	public void addDrone() {
		int x;
		int y;
		int id = findMaxId();
		
		do {
			x = ThreadLocalRandom.current().nextInt(1, row - 1);
			y = ThreadLocalRandom.current().nextInt(1, col - 1);
		} while(!canvas.theSpaceIsClear(x, y));
		
		Drone temp = new Drone(x, y, id);
		droneList.add(temp);
		canvas.projectDronesOnScreen(droneList);
		System.out.println("Drone number " + id + " added at coordinates (" + x + "," + y + ")");
	}
	
	public void moveDrones() {
		
		for(int i = 0; i < droneList.size(); i++) {
			Drone curDrone = droneList.get(i);
			int oldX = curDrone.getX();
			int oldY = curDrone.getY();
			
			for(int j = 0; j < 10; j++) {
				String direction = Direction.getRandomDirection();
				int newX = oldX;
				int newY = oldY;
				
				switch(direction) {
					case "North": newX -= 1; break;
					case "South": newX += 1; break;
					case "West": newY -= 1; break;
					case "East": newY += 1; break;
				}
				
				if(canvas.theSpaceIsClear(newX, newY)) {
					System.out.println("Drone number " + curDrone.getID() + " has moved " + direction);
					//Update coordinates of Drone
					curDrone.setNewCoordinates(newX, newY);
					//Project the drone on the arena
					canvas.projectDronesOnScreen(droneList);
					//Delete old position
					canvas.deleteSpace(oldX, oldY);
					break;
				}
				
			}
			
		}
		
	}
	
	public void moveDronesTenTimes() {
		
		for(int i = 0; i < 10; i++) {
			moveDrones();
			System.out.println(this.toString());
			
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	@Override
    public String toString() { 
		System.out.println(canvas.toString());
        return String.format(""); 
    } 
	
}
