import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Renderer {

	private final AvailablePokemons POKEMONS = new AvailablePokemons();
	private final UI DETAILS = new UI();
	private final UserData USER_DATA = new UserData();
	private final Shop SHOP = new Shop();
	private final BattleArena BATTLE_ARENA = new BattleArena();
	private final LogicPicker LOGIC_PICKER = new LogicPicker();
	
	public void showListOfPokemons() {
		POKEMONS.refreshData();
		
		System.out.println();
		System.out.println("1.Abra");
		DETAILS.showDetails(1);
		System.out.println("Unlocked: " + POKEMONS.getUnlockingLogic(1));
		
		System.out.println();
		System.out.println("2.Diglett");
		DETAILS.showDetails(2);
		System.out.println("Unlocked: " + POKEMONS.getUnlockingLogic(2));
		
		System.out.println();
		System.out.println("3.Entei");
		DETAILS.showDetails(3);
		System.out.println("Unlocked: " + POKEMONS.getUnlockingLogic(3));
		
		System.out.println();
		System.out.println("4.Graveler");
		DETAILS.showDetails(4);
		System.out.println("Unlocked: " + POKEMONS.getUnlockingLogic(4));
		
		System.out.println();
		System.out.println("5.Mudkip");
		DETAILS.showDetails(5);
		System.out.println("Unlocked: " + POKEMONS.getUnlockingLogic(5));
		
		System.out.println();
		System.out.println("6.Pikachu");
		DETAILS.showDetails(6);
		System.out.println("Unlocked: " + POKEMONS.getUnlockingLogic(6));
		
		System.out.println();
		System.out.println("7.Seel");
		DETAILS.showDetails(7);
		System.out.println("Unlocked: " + POKEMONS.getUnlockingLogic(7));
		
		System.out.println();
		System.out.println("8.Slugma");
		DETAILS.showDetails(8);
		System.out.println("Unlocked: " + POKEMONS.getUnlockingLogic(8));
		
		System.out.println();
		System.out.println("9.Tangela");
		DETAILS.showDetails(9);
		System.out.println("Unlocked: " + POKEMONS.getUnlockingLogic(9));
		
		System.out.println();
		System.out.println("10.Treecko");
		DETAILS.showDetails(10);
		System.out.println("Unlocked: " + POKEMONS.getUnlockingLogic(10));
	}
	
	private void showUserData() {
		USER_DATA.showUnlockedPokemons();
		USER_DATA.showPlayersStats();
	}
	
	public void showMainMenu() {
		 Scanner input = new Scanner(System.in);
		
		 showUserData();
		 System.out.println("1.Arena");
		 System.out.println("2.Shop");
		 System.out.println("3.Evolve");
		 System.out.print("--> ");
		 
		 int key = input.nextInt();
		 showAssetsFromTheMainMenu(key);
	}
	
	public void showAssetsFromTheMainMenu(int key) {
		clearScreen();
		
		switch(key) {
			case 1: USER_DATA.showUnlockedPokemons(); arena(); break;
			case 2: showListOfPokemons(); buyPokemon(); break;
			case 3: clearScreen(); showUserData(); evolvePokemon(); break;
            default: displayInvalidDataWarning(); break;
		}
	}
	
	public void unlockPokemon(int key, int costOfPokemon) {
		
		if(!USER_DATA.containsKey(key)){
			
			if(USER_DATA.getMoney() < costOfPokemon) {
				displayInsufficientResourcesWarning();
			} else {
				USER_DATA.reduceMoney(costOfPokemon);
				POKEMONS.unlockPokemon(key);
				USER_DATA.addUnlockedPokemon(key);
				clearScreen();
				showMainMenu();
			}		
			
		} else {
			displayPokemonIsAlreadyInListWarning();
		}
		
	}
	
	public void buyPokemon() {
		System.out.println();
		System.out.println("Enter the key of the pokemon you want to buy");
		System.out.print("--> ");
		
        Scanner input = new Scanner(System.in);
		
		int key = input.nextInt();
		
		if(key > 10 || key < 1) {
			displayInvalidDataWarning();
		} else {
			unlockPokemon(key, SHOP.getCostOfPokemon(key));
		}
		
	}
	
	public void evolvePokemon() {
		System.out.println("Enter the name of the pokemon you want to evolve");
		System.out.print("--> ");
		
        Scanner input = new Scanner(System.in);
		
		String chosenPokemon = input.nextLine();
		
		if(USER_DATA.containsPokemon(chosenPokemon)) {
			
		    if(USER_DATA.getPowerPellets() > 0) {		    	
		    	
		    	if(DETAILS.getPokemonLevel(chosenPokemon) < 3) {
		    		
					DETAILS.evolve(chosenPokemon);
					BATTLE_ARENA.evolve(chosenPokemon);
					USER_DATA.reducePowerPellets();
					clearScreen();
					showMainMenu();			
					
		    	} else {
		    		displayPokemonIsAlreadyAtMaximumLevelWarning();
		    	}
		    	
			} else {
				displayInsufficientResourcesWarning();
			}		
		    
		} else {
			displayPokemonNotInListWarning();
		}
		
	}
	
	public void arena() {
		int number = LOGIC_PICKER.pickEnemy();
		System.out.println("Enter the name of the pokemon you want to figth with");
		System.out.print("--> ");

        Scanner input = new Scanner(System.in);
		
		String chosenPokemon = input.nextLine();
		int moneyPrize;
		int powerPelletsPrize;
		
		if(USER_DATA.containsPokemon(chosenPokemon)) {
			BATTLE_ARENA.setPlayersPokemonDetails(chosenPokemon);
			BATTLE_ARENA.setBotsPokemonDetails(number);
			
			if(BATTLE_ARENA.letThePokemonsFigth()) {
				System.out.println();
				System.out.println("Congratulations, you won");
				
				moneyPrize = LOGIC_PICKER.giveMoney();
				powerPelletsPrize = LOGIC_PICKER.givePowerPellet();
				USER_DATA.takePrize(moneyPrize, powerPelletsPrize);
				
				System.out.printf("You just recieved %d money and %d power pellets", moneyPrize, powerPelletsPrize);
				
				delay();
				clearScreen();
				showMainMenu();
				
			} else {
				System.out.println();
				System.out.println("You lost");
				System.out.println("Just try again");
				
				POKEMONS.losePokemon(chosenPokemon);
				USER_DATA.removeLostPokemon(chosenPokemon);
				
				delay();
				clearScreen();
				showMainMenu();
			}
			
		} else {
			displayPokemonNotInListWarning();
		}
		
	} 
	
	public void displayPokemonIsAlreadyAtMaximumLevelWarning() {
		clearScreen();
		System.out.println("Your pokemon is already at maximum level");
		
		delay();
		
		clearScreen();
		showMainMenu();
	}
	
	public void displayPokemonNotInListWarning() {
		clearScreen();
		System.out.println("The pokemon is not in your list");
		
		delay();
		
		clearScreen();
		showMainMenu();
	}
	
	public void displayPokemonIsAlreadyInListWarning() {
		clearScreen();
		System.out.println("The pokemon is already in your list");

		delay();
		
		clearScreen();
		showMainMenu();
	}
	
	public void displayInsufficientResourcesWarning() {
		clearScreen();
		System.out.println("Insufficient resources");
		
		delay();
		
		clearScreen();
		showMainMenu();
	}
	
	public void displayInvalidDataWarning() {
		clearScreen();
		System.out.println("Invalid data");
		
		delay();
		
		clearScreen();
		showMainMenu();
	}
	
	public void delay() {
		
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void clearScreen() {
		
		for(int i = 0; i < 50; i++) {
			System.out.println();
		}	
		
	}
	
}
