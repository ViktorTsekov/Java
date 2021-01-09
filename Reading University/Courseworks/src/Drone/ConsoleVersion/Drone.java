package Drone.ConsoleVersion;

public class Drone {
	private int x;
	private int y;
	private int id;

	Drone() {
		
	}
	
	Drone(int x, int y, int id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public int getID() {
		return id;
	}
	
	public void setNewCoordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
