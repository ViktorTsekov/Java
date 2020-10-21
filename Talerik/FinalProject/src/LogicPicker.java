
import java.util.Random;

public class LogicPicker {
	
	Random rand = new Random();
	
	public int giveMoney() {
		return rand.nextInt(200) + 50;
	}
	
	public int givePowerPellet() {
		return rand.nextInt(2) + 0;
	}
	
	public int pickEnemy() {
		int randomNumber = rand.nextInt(10) + 1;
		
		switch(randomNumber) {
			case 1: System.out.println("You will figth against Abra"); break;
			case 2: System.out.println("You will figth against Diglett"); break;
			case 3: System.out.println("You will figth against Entei"); break;
			case 4: System.out.println("You will figth against Graveler"); break;
			case 5: System.out.println("You will figth against Mudkip"); break;
			case 6: System.out.println("You will figth against Pikachu"); break;
			case 7: System.out.println("You will figth against Seel");  break;
			case 8: System.out.println("You will figth against Slugma"); break;
			case 9: System.out.println("You will figth against Tangela"); break;
			case 10: System.out.println("You will figth against Treecko"); break;
		}
		
		return randomNumber;
	}

}
