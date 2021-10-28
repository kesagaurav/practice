package staticdemo;

public class Main {

	public Main() {
		System.out.println("\n i'am from main constructor");
	}

	public static void main(String[] args) {

		System.out.println("\n i am from main method");
		isHello();
		Main m = new Main();// in this what we happens is if they are any anumyous classes it will excute first afterwards it will execute the constructor
		m.isNonStatic();

	}

	public static void isHello() {
		System.out.println("\n i'am form static method");
	}

	static {
		System.out.println("\n i am in staic block i will be executing before constructor");
	}

	public void isNonStatic() {
		System.out.println("\n i'am in non static method");
	}

	{
		System.out.println("\n i am in anouyomous block everytime you created an object");
	}

}
