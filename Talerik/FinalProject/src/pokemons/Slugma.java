package pokemons;

import elements.Fire;

public class Slugma implements Fire{
	
	private int Attack = 20;
	private int Defence = 10;
	private int Health = 100;
    private int Level = 1;	
    
	public int getAttack() {
		return Attack;
	}

	public int getDefence() {
		return Defence;
	}

	public int getHealth() {
		return Health;
	}
	
	public int getLevel() {
		return Level;
	}

	@Override
	public Void showStats() {
		
		System.out.println("*" + Slugma.class.getSimpleName() + "-level: " + Level);
		System.out.println("*Price: 400G");
		System.out.println("Attack: " + Attack);
		System.out.println("Defence: " + Defence);
		System.out.println("Health: " + Health);
		
		return null;
	}
	
	@Override
	public Void evolve() {
		
		Level++;
		Attack *= 2;
		Defence *= 2;
		Health *= 2;
		
		return null;
	}

}
