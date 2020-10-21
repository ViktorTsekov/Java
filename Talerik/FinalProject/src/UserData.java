import java.util.ArrayList;

public class UserData {
	
	private ArrayList unlockedPokemons = new ArrayList();
	private ArrayList usedKeys = new ArrayList();
	
	private int money = 1000;
	private int powerPellets = 1;
	
	public void reduceMoney(int cost) {
		this.money -= cost;
	}

	public void reducePowerPellets() {
		this.powerPellets -= 1;
	}

	public int getMoney() {
		return money;
	}

	public int getPowerPellets() {
		return powerPellets;
	}

	public void takePrize(int money, int powerPellets) {
		this.money += money;
		this.powerPellets += powerPellets;
	}
	
	public void showPlayersStats() {
		System.out.printf("Money: %dG", money);
		System.out.println();
		System.out.println("Power pellets: " + powerPellets);
	}
	
	public void showUnlockedPokemons() {
		System.out.println("Unlocked pokemons: " + unlockedPokemons.toString());
	}
	
	public boolean containsPokemon(String chosenPokemon) {
		
		if(!unlockedPokemons.contains(chosenPokemon)) {
			return false;
		} 
		
		return true;
	}
	
	public boolean containsKey(int key) {
		
		if(usedKeys.contains(key)) {
			return true;
		} else {
			usedKeys.add(key);
		}	
		
		return false;
	}
	
	public void removeLostPokemon(String key) {
		
		switch(key) {
			case "Abra": unlockedPokemons.remove("Abra"); usedKeys.remove(new Integer(1)); break;
			case "Diglett": unlockedPokemons.remove("Diglett"); usedKeys.remove(new Integer(2)); break;
			case "Entei": unlockedPokemons.remove("Entei"); usedKeys.remove(new Integer(3)); break;
			case "Graveler": unlockedPokemons.remove("Graveler"); usedKeys.remove(new Integer(4)); break;
			case "Mudkip": unlockedPokemons.remove("Mudkip"); usedKeys.remove(new Integer(5)); break;
			case "Pikachu": unlockedPokemons.remove("Pikachu"); usedKeys.remove(new Integer(6)); break;
			case "Seel": unlockedPokemons.remove("Seel"); usedKeys.remove(new Integer(7)); break;
			case "Slugma": unlockedPokemons.remove("Slugma"); usedKeys.remove(new Integer(8)); break;
			case "Tangela": unlockedPokemons.remove("Tangela"); usedKeys.remove(new Integer(9)); break;
			case "Treecko": unlockedPokemons.remove("Treecko"); usedKeys.remove(new Integer(10)); break;
		}
		
	}
	
	public void addUnlockedPokemon(int key) {
			
			switch(key) {
				case 1: unlockedPokemons.add("Abra"); break;
				case 2: unlockedPokemons.add("Diglett"); break;
				case 3: unlockedPokemons.add("Entei"); break;
				case 4: unlockedPokemons.add("Graveler"); break;
				case 5: unlockedPokemons.add("Mudkip"); break;
				case 6: unlockedPokemons.add("Pikachu"); break;
				case 7: unlockedPokemons.add("Seel"); break;
				case 8: unlockedPokemons.add("Slugma"); break;
				case 9: unlockedPokemons.add("Tangela"); break;
				case 10: unlockedPokemons.add("Treecko"); break;
			}
			
	}

}
