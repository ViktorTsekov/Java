package pokemons;

import elements.Electric;

public class Abra implements Electric{
	
	private int Attack = 30;
	private int Defence = 10;
	private int Health = 70;
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
		
		System.out.println("*" + Abra.class.getSimpleName() + "-level: " + Level);
		System.out.println("*Price: 500G");
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
