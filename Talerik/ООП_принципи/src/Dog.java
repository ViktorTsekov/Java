
public class Dog implements Comparable<Dog>{
    public String name;
    private String gender;
    private int age;
    private String dogColor;
    static int serialNumber = 0;
    int dogNumber;
    
    public Dog(String name){
    	this.name = name;
    	serialNumber++;
    	dogNumber = serialNumber;
    }
    
    public void bark(){
    	System.out.println("bau bau");
    }

    @Override
    public int compareTo(Dog dog2){
    	if(this.name.equals(dog2.name)){
    		return 1;
    	}
    	return 0;
    }
}
