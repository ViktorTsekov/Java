package Drone.GUIversion;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Drone extends DroneAbstraction {
	private ImageIcon droneImage = new ImageIcon("Drone.png");
	private int movementFactor = 7;
	
	private int x;
	private int y;
	private int id;
	private String role;
	private static int idGenerator;
	
	//Constructors
	Drone() {
		this.id = idGenerator;
		idGenerator++;
	}
	
	Drone(int x, int y, String role) {
		this.x = x;
		this.y = y;
		this.id = idGenerator;
		this.role = role;
		idGenerator++;
	}

	//Getters and setters
	public ImageIcon getDroneImage() {
		return droneImage;
	}
	
	public void setIdGenerator(int n) {
		idGenerator = n;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getRole() {
		return role;
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
	
	//Methods
	@Override
	public void animate(JPanel arena) {
		
		if(role.equals("horizontal")) {

			if(x <= 0 || x >= arena.getWidth() - 40) {
				movementFactor *= -1;
			}
			
			x += movementFactor;
		} else if(role.equals("vertical")) {

			if(y <= 0 || y >= arena.getHeight() - 40) {
				movementFactor *= -1;
			} 
			
			y += movementFactor;
		} else if(role.equals("diagonal")) {
			
			if(x <= 0 || x >= arena.getWidth() - 40 || y <= 0 || y >= arena.getHeight() - 40) {
				movementFactor *= -1;
			}
			
			x += movementFactor;
			y += movementFactor;
		}
		
	}
	 
	@Override
    public String toString() { 
        return String.format("Drone number " + id + " at position " + x + ", " + y + "<br>"); 
    }
	
}
