package Drone.ConsoleVersion;

import java.util.List;

public class ConsoleCanvas {
	private int[][] arena;
	private int row;
	private int col;
	
	private int emptySpace;
	private int drone;
	private int wall;
	
	ConsoleCanvas(int height, int width) {
		row = height + 2;
		col = width + 2;
		arena = new int [row][col];
		emptySpace = 0;
		drone = 1;
		wall = 2;
		initArena();
	}

	private void initArena() {
		
		for (int i = 0; i < row; i++) {
			arena[i][0] = wall;
			arena[i][col - 1] = wall;
		}
			
		for (int j = 0; j < col; j++) {
			arena[0][j] = wall;
			arena[row - 1][j] = wall;
		}
		
	}
	
	public void changeCanvas(int newX, int newY) {
		row = newX + 2;
		col = newY + 2;
		arena = new int [row][col];
		initArena();
	}
	
	public void deleteSpace(int x, int y) {
		arena[x][y] = emptySpace;
	}
	
	public boolean theSpaceIsClear(int x, int y) {
		
		//Check if the drone is in the arena
		if(x < 1 || x > row - 2 || y < 1 || y > col - 2) {
			return false;
		}
		
		//Check if the space is free
		if(arena[x][y] != emptySpace) {
			return false;
		}
		
		return true;
	}
	
	public void projectDronesOnScreen(List<Drone> droneList) {
		for(int i = 0; i < droneList.size(); i++) {
			Drone curDrone = droneList.get(i);
			arena[curDrone.getX()][curDrone.getY()] = drone;
		}
	}
	
	@Override
	public String toString() {
		System.out.println("Arena size: " + row + "x" + col);
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {

				if(arena[i][j] == emptySpace) {
					System.out.print(" ");
				} else if(arena[i][j] == drone) {
					System.out.print("D");
				} else if(arena[i][j] == wall) {
					System.out.print("#");
				} 
				
			}
			System.out.println();
		}
		 
		return "";
	}
	
}
