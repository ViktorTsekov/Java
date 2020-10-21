
public class PlayingPiece {

	private int X;
	private int Y;
	private boolean isAlive;
	
	public PlayingPiece(int startX, int startY) {
		super();
		this.X = startX;
		this.Y = startY;
		this.isAlive = true;
	}	
	
	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public int getX(){
		return this.X;
	}
	
	public void setX(int x) {
		this.X = x;
	}

	public void setY(int y) {
		this.Y = y;
	}

	public int getY(){
		return this.Y;
	}
	
	public void move(int newX, int newY){
		this.X = newX;
		this.Y = newY;
	}
	
	public boolean moveIsLegal(int newX, int newY){
		if(newX>8 || newY>8 || newX<=0 || newY<=0){
			return false;
		}
		else {
			return true;
		}
	}
	
	public static void main(String[] args) {
		

	}

}
