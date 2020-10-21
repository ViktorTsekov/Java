
public class Shop {
	
	//private final ABRA_PRICE = 500;
	//private final DIGLETT_PRICE = 400;
	//private final ENTEI_PRICE = 300;
	//private final GRAVELER_PRICE = 400;
	//private final MUDKIP_PRICE = 300;
	//private final PIKACHU_PRICE = 500;
	//private final SEEL_PRICE = 300;
	//private final SLUGMA_PRICE = 400;
	//private final TANGELA_PRICE = 400;
	//private final TREECKO_PRICE = 500;
	
	public int getCostOfPokemon(int key) {
		
		switch(key) {
			case 1: ;
			case 6: ;
			case 10: return 500; 		
			
			case 2: ;
			case 4: ;
			case 8: ;
			case 9: return 400; 
			
			case 3: ;
			case 5: ;			
			case 7: return 300; 
		}
		
		return 0;				
	}

}
