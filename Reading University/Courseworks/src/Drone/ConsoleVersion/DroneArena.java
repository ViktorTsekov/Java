package Drone.ConsoleVersion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

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
	
	public void addDrone() {
		int x = ThreadLocalRandom.current().nextInt(1, row - 1);
		int y = ThreadLocalRandom.current().nextInt(1, col - 1);
		
		for(int i = 0; i < droneList.size(); i++) {
			Drone d = droneList.get(i);
			
			if(d.getX() == x && d.getY() == y) {
				addDrone();
			}
			
		}
		
		Drone temp = new Drone(x, y);
		droneList.add(temp);
		System.out.println("New drone added at coordinates (" + x + "," + y + ")");
	}
	
	public void moveDrones() {
		
		for(int i = 0; i < droneList.size(); i++) {
			Drone curDrone = droneList.get(i);
			int x = curDrone.getX();
			int y = curDrone.getY();
			
			for(int j = 0; j < 10; j++) {
				String direction = Direction.getRandomDirection();
				int newX = x;
				int newY = y;
				
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
					canvas.deleteSpace(x, y);
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
		canvas.projectDronesOnScreen(droneList);
		System.out.println(canvas.toString());
        return String.format(""); 
    } 
	
}
