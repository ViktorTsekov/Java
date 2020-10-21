package pokemons;

import elements.Water;

public class Seel implements Water{
	
	private int Attack = 20;
	private int Defence = 10;
	private int Health = 90;
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
		
		System.out.println("*" + Seel.class.getSimpleName() + "-level: " + Level);
		System.out.println("*Price: 300G");
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
