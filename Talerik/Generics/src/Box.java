
public class Box<T> {

	private T object;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	
	public <U extends Number> void inspect(U u) {
		System.out.println("T: " + object.getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}
	
}
