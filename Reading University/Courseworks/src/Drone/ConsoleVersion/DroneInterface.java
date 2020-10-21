package Drone.ConsoleVersion;

import java.util.Scanner;

public class DroneInterface {
	private Scanner scanner;
	private DroneArena arena;
	
	DroneInterface() {
		scanner = new Scanner(System.in);
		arena  = new DroneArena(10, 20);
	}
	
	public void interactWithInterface() {
		char input = ' ';
		
		do {
			System.out.println("\nEnter A to add new drone. Enter I to check information. Enter M to move the drones once. Enter T to move the drones ten times. Enter X to exit:");
			input = scanner.next().charAt(0);
			
			switch(input) {
				case 'A':
				case 'a': arena.addDrone(); break;
				case 'M':
				case 'm': arena.moveDrones(); break;
				case 'I':
				case 'i': System.out.println(arena.toString()); break;
				case 'T':
				case 't': arena.moveDronesTenTimes(); break;
				case 'X': input = 'x'; break;
				case 'x': break;
			}
			
		} while(input != 'x');
		
	}
	
}
