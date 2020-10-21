

public class Circle {
    
	int r;
	
	public Circle(int r){
		this.r = r;
	}
	
	public double getPerimeter(){
		return 2 * r * Math.PI;
	}
	
	public double getArea(){
		return r * r * Math.PI;
	}
	
	public static void main(String[] args) {
		Circle r = new Circle (5);
		System.out.println(r.getPerimeter());
		System.out.println(r.getArea());

	}
     
}
