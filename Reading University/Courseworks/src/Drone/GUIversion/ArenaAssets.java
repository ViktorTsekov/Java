package Drone.GUIversion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ArenaAssets {
	private List<Drone> drones;
	
	ArenaAssets() {
		drones = new ArrayList<Drone>();
	}
	
	//Drone renderer
	protected void projectDroneOnScreen(JPanel arena, Drone drone) {
		JLabel label = new JLabel("");
		
		label.setIcon(drone.getDroneImage());
		label.setSize(40, 40);
		label.setLocation(drone.getX(), drone.getY());
		arena.setLayout(null);
		arena.add(label);
		arena.revalidate();
		arena.repaint();
	}
	
	//Verification of coordinates
	protected boolean theCoordinatesAreUnique(int x, int y) {
		
		for(int i = 0; i < drones.size(); i++) {
			Drone curDrone = drones.get(i);
			
			if((x > curDrone.getX() && x <= curDrone.getX() + 40) && (y > curDrone.getY() && y <= curDrone.getY() + 40)) {				
				return false;
			}
			
		}

		return true;
	}
	
	//Find the largest ID of the current drones on the screen
	protected int findBiggestID() {
		int max = 0;
		
		for(int i = 0; i < drones.size(); i++) {
			Drone drone = drones.get(i);
			
			if(max < drone.getID()) {
				max = drone.getID();
			}
			
		}
		
		return max + 1;
	}
	
	public void emptyList() {
		drones.clear();
	}
	
	public void addNewDrone(JPanel arena, String role) {
		int randX;
		int randY;
		
		do {
			randX = ThreadLocalRandom.current().nextInt(0, arena.getWidth() - 40);
			randY = ThreadLocalRandom.current().nextInt(0, arena.getHeight() - 40);
		} while(!theCoordinatesAreUnique(randX, randY));

		Drone newDrone = new Drone(randX, randY, role);
		drones.add(newDrone);
		projectDroneOnScreen(arena, newDrone); 
	}
	
	public void addNewDrone(int x, int y) {
		Drone newDrone = new Drone(x, y, "");
		drones.add(newDrone);
	}
	
	public void moveDrones(JPanel arena) {

		for(int i = 0; i < drones.size(); i++) {
			Drone curDrone = drones.get(i);
			
			curDrone.animate(arena);
			projectDroneOnScreen(arena, curDrone);
		}
		
	}
	
	public void clearPanel(JPanel arena) {
		arena.removeAll();
		arena.revalidate();
		arena.repaint();
	}
	
	public void showInformationOnScreen(JLabel information) {
		String message = "<html>";
		
		for(int i = 0; i < drones.size(); i++) {
			Drone curDrone = drones.get(i);
			
			message += curDrone.toString();
		}
		
		message += "</html>";
		information.setText(message);
	}
	
	public void saveToFile() {
		FileWriter myWriter;
		
		try {
			myWriter = new FileWriter("info.txt");
			PrintWriter printWriter = new PrintWriter(myWriter);
			
			for(int i = 0; i < drones.size(); i++) {
				String str = "";
				Drone cur = drones.get(i);
				
				//Create the current line of the file
				str += cur.getX() + " ";
				str += cur.getY() + " ";
				str += cur.getID() + " ";
				str += cur.getRole();
				str += "\n";
				
				//Write in the file
				printWriter.print(str);
			}
			
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void loadFromFile(JPanel arena) {
		File myObj = new File("info.txt");
	    Scanner myReader;
	    
	    //Check if the file is empty
	    if(myObj.length() == 0) {
	    	return;
	    }
	    
		try {
			drones.clear();
			myReader = new Scanner(myObj);
			
			while (myReader.hasNextLine()) {
		        String str = myReader.nextLine();
		        Drone drone = new Drone();
		        //Split the current line by regex " " and put the elements in a list
		        var data = Arrays.stream(str.split(" ")).collect(Collectors.toList());
		        
		        //Set the attributes of the current drone
		        drone.setX(Integer.parseInt(data.get(0)));
		        drone.setY(Integer.parseInt(data.get(1)));
		        drone.setID(Integer.parseInt(data.get(2)));
		        drone.setRole(data.get(3).toString());
		        
		        //Add drone to the list
		        drones.add(drone);
		        projectDroneOnScreen(arena, drone);
		    }
			
			//Update the id generator to the largest current id in order to avoid non-unique id's
			drones.get(drones.size() - 1).setIdGenerator(findBiggestID());
		    myReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
