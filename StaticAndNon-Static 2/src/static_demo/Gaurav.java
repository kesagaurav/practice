package static_demo;

public class Gaurav {

	public Gaurav() {
		System.out.println("\n i'am in the constructor gaurav main");
	}

	public static void main(String[] args) {

		Gaurav g=new Gaurav();
	}
	
	public static void isStatic() {
		System.out.println("\n i am in static method");
	}
	
	static {
		System.out.println("i'am the person who will be exceuted first and only once");
	}
	
	{
		System.out.println("i'am in anonymous class i will excete before the object creation");
	}
	
	

}
