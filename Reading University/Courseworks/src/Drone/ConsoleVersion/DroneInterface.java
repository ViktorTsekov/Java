package Drone.ConsoleVersion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DroneInterface {
	private Scanner scanner;
	private DroneArena arena;
	
	DroneInterface() {
		scanner = new Scanner(System.in);
		promptUserForArenaInput();
	}
	
	public void interactWithInterface() {
		int x;
		int y;
		char input = ' ';
		String fileName = "";
		
		do {
			System.out.println("\nEnter A to add new drone. Enter I to check information. Enter M to move the drones once. Enter T to move the drones ten times. Enter S to set new arena. Enter Q to save drones to file. Enter L to load drones from file. Enter X to exit:");
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
				case 'S':
				case 's': System.out.println("Enter new X: "); x = scanner.nextInt();
						  System.out.println("Enter new Y: "); y = scanner.nextInt();
						  
						  if(x < 5 || y < 5) {
							  System.out.println("Dimensions are too small"); break;
						  } else {
							  arena.changeDimensions(x, y); break;
						  }
				case 'Q':
				case 'q': System.out.println("Enter the file you want to save into: "); fileName = scanner.next(); arena.saveInformationToFile(fileName); arena.saveArena(); break;
				case 'L':
				case 'l': System.out.println("Enter the file you want to read from: "); fileName = scanner.next(); arena.readInformationFromFile(fileName); break;
				case 'X': input = 'x'; break;
				case 'x': break;
			}
			
			fileName = "";
		} while(input != 'x');

	}

	private void promptUserForArenaInput() {
		System.out.println("Press 1 to set you own dimensions of the arena. Press anything else to load the last dimensions saved into the file:");
		
		String inp = scanner.next();
		int x; 
		int y;

		if(inp.equals("1")) {
			System.out.println("Set X: "); x = scanner.nextInt();
			System.out.println("Set Y: "); y = scanner.nextInt();
			
			if(x < 5 || y < 5) {
				System.out.println("Dimensions are too small\n");
				promptUserForArenaInput();
			} else {
				System.out.println("Arena with dimensions: (" + x + "x" + y + ") created");
				arena  = new DroneArena(x, y);
			}

		} else {
			setArenaDimensionsFromFile();
		}
		
	}
	
	private void setArenaDimensionsFromFile() {
		File myObj = new File("dimensions.txt");

	    if(myObj.length() == 0) {
	    	//Default Dimensions
	    	System.out.println("Arena with dimensions: (10x20) loaded");
	    	arena  = new DroneArena(10, 20);
	    	return;
	    }
	    
		try {
			Scanner myReader = new Scanner(myObj);
			String str = myReader.nextLine();
			var data = Arrays.stream(str.split(" ")).collect(Collectors.toList());
			
			int x = Integer.parseInt(data.get(0));
			int y = Integer.parseInt(data.get(1));
			
			System.out.println("Arena with dimensions: (" + x + "x" + y + ") loaded from file");
			arena  = new DroneArena(x, y);
			
		    myReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}