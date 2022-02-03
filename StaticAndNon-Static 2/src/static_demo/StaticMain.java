package static_demo;

public class StaticMain {

	public StaticMain() {
		System.out.println("\n i'am in the constructor in the static main");
	}

	String name="gaurav";
	int id=10;
	
	public static void main(String[] args) {
		isStatic();

		StaticMain sm = new StaticMain();
		sm.isNonStatic();
		System.out.println("---------------------------------------------------------");
		Gaurav.isStatic();
		String name="deepa";
		int id=101;
		System.out.println(name + " " + id);
		String s1=new String("hello");
		System.out.println(s1 + " s1 hashcode is " + System.identityHashCode(s1));
		String s2=new String("hello");
		System.out.println(s2 + " s2 hashcode is " + System.identityHashCode(s2));

	}
	


	public static void isStatic() {
		System.out.println("\n hi i'am in static method");
	}

	public void isNonStatic() {
		System.out.println("\n hi i am in non static method");
	}

	static {
		System.out.println("\n hi i'am in static block i will be excueted only once and first i will be exceute");
	}
	{
		System.out.println("\n hi i am in anoymous block it will be exceuted before the object creation");
	}

}
