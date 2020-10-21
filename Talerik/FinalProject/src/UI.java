import pokemons.*;

public class UI {
	
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
	
	public int getPokemonLevel(String key) {
		
		switch(key) {
			case "Abra": return abra.getLevel();
			case "Diglett": return diglett.getLevel();
			case "Entei": return entei.getLevel();
			case "Graveler": return graveler.getLevel();
			case "Mudkip": return mudkip.getLevel();
			case "Pikachu": return pikachu.getLevel();
			case "Seel": return seel.getLevel();
			case "Slugma": return slugma.getLevel();
			case "Tangela": return tangela.getLevel();
			case "Treecko": return treecko.getLevel();
		}
		
		return 0;
	}
	
	public void showDetails(int key) {
		
		switch(key) {
			case 1: abra.showStats(); break;
			case 2: diglett.showStats(); break;
			case 3: entei.showStats(); break;
			case 4: graveler.showStats(); break;
			case 5: mudkip.showStats(); break;
			case 6: pikachu.showStats(); break;
			case 7: seel.showStats(); break;
			case 8: slugma.showStats(); break;
			case 9: tangela.showStats(); break;
			case 10: treecko.showStats(); break;
        }
		
	}
	
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

}
