import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class HashMapTest {

	@Test
	public void testAddingOneElement() {
		HashMap<String, String> map = new HashMap<>();
		String element = "asd";
		String key = "key";
		map.put(key, element);
		
		String result = map.get(key);
		Assert.assertNotNull(result);
	}
	
	@Test
	public void testDeleteElement() {
		HashMap<String, String> map = new HashMap<>();
		String element = "asd";
		String key = "key";
		map.put(key, element);
		map.remove(key);
		
		String result = map.get(key);
		Assert.assertNotNull(result);
	}
	
}
