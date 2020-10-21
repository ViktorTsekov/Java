
public class Bishop extends PlayingPiece{

	public Bishop(int startX, int startY){
		super(startX, startY);
	}

	@Override
	public boolean moveIsLegal(int newX, int newY) {
		
		if(super.moveIsLegal(newX, newY)) {
			if(Math.abs(newY - getY()) == Math.abs(newX - getX())){
				return true;
			}
		}
		return false;
	}


}
