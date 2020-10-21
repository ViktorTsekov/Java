import java.util.HashMap;

public class AvailablePokemons {
	
   private HashMap<Integer, Boolean> unlockingLogic = new HashMap<>();
	
   private boolean AbraIsAvailable;
   private boolean DiglettIsAvailable;
   private boolean EnteiIsAvailable;
   private boolean GravelerIsAvailable;
   private boolean MudkipIsAvailable;
   private boolean PikachuIsAvailable;
   private boolean SeelIsAvailable;
   private boolean SlugmaIsAvailable;
   private boolean TangelaIsAvailable;
   private boolean TreeckoIsAvailable;
	
	public void refreshData() {
		unlockingLogic.put(1, AbraIsAvailable);
		unlockingLogic.put(2, DiglettIsAvailable);
		unlockingLogic.put(3, EnteiIsAvailable);
		unlockingLogic.put(4, GravelerIsAvailable);
		unlockingLogic.put(5, MudkipIsAvailable);
		unlockingLogic.put(6, PikachuIsAvailable);
		unlockingLogic.put(7, SeelIsAvailable);
		unlockingLogic.put(8, SlugmaIsAvailable);
		unlockingLogic.put(9, TangelaIsAvailable);
		unlockingLogic.put(10, TreeckoIsAvailable);
	}
	
	public boolean getUnlockingLogic(int key) {
			return unlockingLogic.get(key);
	}
	
	public void losePokemon(String key) {
		
		switch(key) {
				case "Abra": AbraIsAvailable = new Boolean(false); break;
				case "Diglett": DiglettIsAvailable = new Boolean(false); break;
				case "Entei": EnteiIsAvailable = new Boolean(false); break;
				case "Graveler": GravelerIsAvailable = new Boolean(false); break;
				case "Mudkip": MudkipIsAvailable = new Boolean(false); break;
				case "Pikachu": PikachuIsAvailable = new Boolean(false); break;
				case "Seel": SeelIsAvailable = new Boolean(false); break;
				case "Slugma": SlugmaIsAvailable = new Boolean(false); break;
				case "Tangela": TangelaIsAvailable = new Boolean(false); break;
				case "Treecko": TreeckoIsAvailable = new Boolean(false); break;
		}
		
	}
	
	public void unlockPokemon(int position) {
		
		switch(position) {
				case 1: AbraIsAvailable = new Boolean(true); break;
				case 2: DiglettIsAvailable = new Boolean(true); break;
				case 3: EnteiIsAvailable = new Boolean(true); break;
				case 4: GravelerIsAvailable = new Boolean(true); break;
				case 5: MudkipIsAvailable = new Boolean(true); break;
				case 6: PikachuIsAvailable = new Boolean(true); break;
				case 7: SeelIsAvailable = new Boolean(true); break;
				case 8: SlugmaIsAvailable = new Boolean(true); break;
				case 9: TangelaIsAvailable = new Boolean(true); break;
				case 10: TreeckoIsAvailable = new Boolean(true); break;
		}
		
	}	
	
}
