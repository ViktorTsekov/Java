import java.util.concurrent.TimeUnit;
import pokemons.*;

public class BattleArena {

	private String playersPokemon;
	private String botPokemon;
	
	private int playersAttack;
	private int botAttack;
	
	private int playersHealth;
	private int botHealth;
	
	private int playersDefence;
	private int botDefence;
	
	private String playersElement;
	private String botElement;
	
	private Abra abra = new Abra();
	private Diglett diglett = new Diglett();
	private Entei entei = new Entei();
	private Graveler graveler = new Graveler();
	private Mudkip mudkip = new Mudkip();
	private Pikachu pikachu = new Pikachu();
	private Seel seel = new Seel();
	private Slugma slugma = new Slugma();
	private Tangela tangela = new Tangela();
	private Treecko treecko = new Treecko();
	
	public void evolve(String key) {
		
		switch(key) {
			case "Abra": abra.evolve(); break;
			case "Diglett": diglett.evolve(); break;
			case "Entei": entei.evolve(); break;
			case "Graveler": graveler.evolve(); break;
			case "Mudkip": mudkip.evolve(); break;
			case "Pikachu": pikachu.evolve(); break;
			case "Seel": seel.evolve(); break;
			case "Slugma": slugma.evolve(); break;
			case "Tangela": tangela.evolve(); break;
			case "Treecko": treecko.evolve(); break;
        }
	}
	
	public void setPlayersPokemonDetails(String chosenPokemon) {
		
		Class[] pokemonInterfaces = null;
		
		switch(chosenPokemon) {
			case "Abra": playersAttack = abra.getAttack(); playersHealth = abra.getHealth(); playersDefence = abra.getDefence(); 
	    		pokemonInterfaces = abra.getClass().getInterfaces(); break;
	    		
			case "Diglett": playersAttack = diglett.getAttack(); playersHealth = diglett.getHealth(); playersDefence = diglett.getDefence(); 
				pokemonInterfaces = diglett.getClass().getInterfaces(); break;
				
			case "Entei": playersAttack = entei.getAttack(); playersHealth = entei.getHealth(); playersDefence = entei.getDefence(); 
				pokemonInterfaces = entei.getClass().getInterfaces(); break;
				
			case "Graveler": playersAttack = graveler.getAttack(); playersHealth = graveler.getHealth(); playersDefence = graveler.getDefence(); 
				pokemonInterfaces = graveler.getClass().getInterfaces(); break;
			
			case "Mudkip": playersAttack = mudkip.getAttack(); playersHealth = mudkip.getHealth(); playersDefence = mudkip.getDefence(); 
				pokemonInterfaces = mudkip.getClass().getInterfaces(); break;
				
			case "Pikachu": playersAttack = pikachu.getAttack(); playersHealth = pikachu.getHealth(); playersDefence = pikachu.getDefence(); 
				pokemonInterfaces = pikachu.getClass().getInterfaces(); break;
				
			case "Seel": playersAttack = seel.getAttack(); playersHealth = seel.getHealth(); playersDefence = seel.getDefence(); 
				pokemonInterfaces = seel.getClass().getInterfaces(); break;
				
			case "Slugma": playersAttack = slugma.getAttack(); playersHealth = slugma.getHealth(); playersDefence = slugma.getDefence(); 
				pokemonInterfaces = slugma.getClass().getInterfaces(); break;
				
			case "Tangela": playersAttack = tangela.getAttack(); playersHealth = tangela.getHealth(); playersDefence = tangela.getDefence(); 
				pokemonInterfaces = tangela.getClass().getInterfaces(); break;
				
			case "Treecko": playersAttack = treecko.getAttack(); playersHealth = treecko.getHealth(); playersDefence = treecko.getDefence(); 
				pokemonInterfaces = treecko.getClass().getInterfaces(); break;
	    }  

		this.playersPokemon = new String(chosenPokemon);
		this.playersElement = pokemonInterfaces[0].getSimpleName().toString();
	}
	
	public void setBotsPokemonDetails(int number) {
		
		Class[] pokemonInterfaces = null;
		
		switch(number) {
			case 1: botAttack = abra.getAttack(); botHealth = abra.getHealth() - 20; botDefence = abra.getDefence() - 5; 
		    	pokemonInterfaces = abra.getClass().getInterfaces(); botPokemon = new String("Abra"); break;
		    	
			case 2: botAttack = diglett.getAttack(); botHealth = diglett.getHealth() - 20; botDefence = diglett.getDefence() - 5; 
				pokemonInterfaces = diglett.getClass().getInterfaces(); botPokemon = new String("Diglett"); break;
				
			case 3: botAttack = entei.getAttack(); botHealth = entei.getHealth() - 20; botDefence = entei.getDefence() - 5; 
				pokemonInterfaces = entei.getClass().getInterfaces(); botPokemon = new String("Entei"); break;
				
			case 4: botAttack = graveler.getAttack(); botHealth = graveler.getHealth() - 20; botDefence = graveler.getDefence() - 5; 
				pokemonInterfaces = graveler.getClass().getInterfaces(); botPokemon = new String("Graveler"); break;
				
			case 5: botAttack = mudkip.getAttack(); botHealth = mudkip.getHealth() - 20; botDefence = mudkip.getDefence() - 5; 
				pokemonInterfaces = mudkip.getClass().getInterfaces(); botPokemon = new String("Mudkip"); break;
				
			case 6: botAttack = pikachu.getAttack(); botHealth = pikachu.getHealth() - 20; botDefence = pikachu.getDefence() - 5; 
				pokemonInterfaces = pikachu.getClass().getInterfaces(); botPokemon = new String("Pikachu"); break;
				
			case 7: botAttack = seel.getAttack(); botHealth = seel.getHealth() - 20; botDefence = seel.getDefence() - 5; 
				pokemonInterfaces = seel.getClass().getInterfaces(); botPokemon = new String("Seel"); break;
				
			case 8: botAttack = slugma.getAttack(); botHealth = slugma.getHealth() - 20; botDefence = slugma.getDefence() - 5; 
				pokemonInterfaces = slugma.getClass().getInterfaces(); botPokemon = new String("Slugma"); break;
				
			case 9: botAttack = tangela.getAttack(); botHealth = tangela.getHealth() - 20; botDefence = tangela.getDefence() - 5; 
				pokemonInterfaces = tangela.getClass().getInterfaces(); botPokemon = new String("Tangela"); break;
				
			case 10: botAttack = treecko.getAttack(); botHealth = treecko.getHealth() - 20; botDefence = treecko.getDefence() - 5; 
				pokemonInterfaces = treecko.getClass().getInterfaces(); botPokemon = new String("Treecko"); break;
		}

		this.botElement = pokemonInterfaces[0].getSimpleName().toString();
	}
	
	public boolean letThePokemonsFigth() {
		
		int turnChanger = 0;
		int damage = 0;
		int multiplier;
		
		clearScreen();
		System.out.println(playersPokemon + ": " + playersHealth + " health");
		System.out.println(botPokemon + ": " + botHealth + " health");
		delay();
		
		while(botHealth > 0) {
			
			if(turnChanger % 2 == 0) {
				clearScreen();
				System.out.println(playersPokemon + " attacked");
				multiplier = setMultiplier(turnChanger);
				damage = playersAttack * multiplier - botDefence;
				botHealth -= damage; 
			}
			
			if(turnChanger % 2 != 0) {
				clearScreen();
				System.out.println(botPokemon + " attacked");
				multiplier = setMultiplier(turnChanger);
				damage = botAttack * multiplier - playersDefence;
				playersHealth -= damage; 
			}
			
			if(playersHealth < 0) { playersHealth = 0; }
			if(botHealth < 0) { botHealth = 0; }
			
			System.out.println(playersPokemon + ": " + playersHealth + " health");
			System.out.println(botPokemon + ": " + botHealth + " health");
			delay();
			
			if(playersHealth == 0) {
				return false;
			}
			
			turnChanger++;
		}
		
		return true;
	}
	
	private void delay() {
		
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
   private void clearScreen() {
		
		for(int i = 0; i < 20; i++) {
			System.out.println();
		}	
		
	}
	
	private int setMultiplier(int turnChanger) {
		
		if(turnChanger % 2 == 0) {
			
			if(playersElement.equals("Electric")) {
				
				if(botElement.equals("Water")) {
					return 2;
				}
			}
			
			if(playersElement.equals("Fire")) {
				
				if(botElement.equals("Grass")) {
					return 2;
				}
			}
			
			if(playersElement.equals("Grass")) {
				
				if(botElement.equals("Ground")) {
					return 2;
				}
			}
			
			if(playersElement.equals("Ground")) {
				
				if(botElement.equals("Electric")) {
					return 2;
				}
			}
			
			if(playersElement.equals("Water")) {
				
				if(botElement.equals("Fire")) {
					return 2;
				}
			}
			
		}
		
		if(turnChanger % 2 != 0) {
			
			if(botElement.equals("Electric")) {
				
				if(playersElement.equals("Water")) {
					return 2;
				}
			}
			
			if(botElement.equals("Fire")) {
				
				if(playersElement.equals("Grass")) {
					return 2;
				}
			}
			
			if(botElement.equals("Grass")) {
				
				if(playersElement.equals("Ground")) {
					return 2;
				}
			}
			
			if(botElement.equals("Ground")) {
				
				if(playersElement.equals("Electric")) {
					return 2;
				}
			}
			
			if(botElement.equals("Water")) {
				
				if(playersElement.equals("Fire")) {
					return 2;
				}
			}
			
		}
		
		return 1;
	}
	
}
