package Drone.GUIversion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCases {

	@Test
	void uniquePosition1() {
		ArenaAssets arenaAssets = new ArenaAssets();
		
		arenaAssets.addNewDrone(10, 10);		
		assertEquals(false, arenaAssets.theCoordinatesAreUnique(20, 20));
	}

	@Test
	void uniquePosition2() {
		ArenaAssets arenaAssets = new ArenaAssets();
		
		arenaAssets.addNewDrone(100, 100);		
		assertEquals(true, arenaAssets.theCoordinatesAreUnique(20, 20));
	}
	
	@Test
	void biggestID1() {
		ArenaAssets arenaAssets = new ArenaAssets();
		
		arenaAssets.emptyList();
		arenaAssets.addNewDrone(100, 100);
		arenaAssets.addNewDrone(200, 200);	
		arenaAssets.addNewDrone(300, 300);	
		assertEquals(5, arenaAssets.findBiggestID());
	}
	
	@Test
	void biggestID2() {
		ArenaAssets arenaAssets = new ArenaAssets();
		
		arenaAssets.emptyList();
		arenaAssets.addNewDrone(100, 100);
		arenaAssets.addNewDrone(200, 200);	
		arenaAssets.addNewDrone(300, 300);	
		arenaAssets.addNewDrone(400, 400);
		arenaAssets.addNewDrone(500, 500);	
		assertEquals(10, arenaAssets.findBiggestID());
	}
	
}
