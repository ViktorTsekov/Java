package Drone.ConsoleVersion;

public class Drone {
	private int x;
	private int y;
	private int id;
	private static int idGenerator;
	
	Drone(int x, int y) {
		this.x = x;
		this.y = y;
		id = idGenerator++;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getID() {
		return id;
	}
	
	public void setNewCoordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
    public String toString() { 
        return String.format("Drone number " + id + " at position(" + x + "," + y + ")"); 
    } 
	
}
