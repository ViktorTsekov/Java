
public class Generic <K, V> implements Pair<K, V>{

	private K key;
	private V value;
	
	public Generic (K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	@Override
	public K getKey() {		
		return this.key;
	}

	@Override
	public V getValue() {
		return this.value;
	}
	
	public void printData(K k, V v) {		
		System.out.println("key: " + k.getClass().getName());
		System.out.println("value: " + v.getClass().getName());
	}

}
