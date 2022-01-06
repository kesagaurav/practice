import java.io.IOException;

public class A {

	private int id;
	private String name;

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	private A(int id, String name) {
		this.id = id;
		this.name = name;
	}

	private final int getId() {
		return id;
	}

	private final void setId(int id) {
		this.id = id;
	}

	private final String getName() {
		return name;
	}

	private final void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + "]";
	}
	public  static class C {
		public   void show1() {
			System.out.println("\n i am in inner class C");
		}
	}
	
	public static class Deepa{
		public static void showGaurav() {
			System.out.println("\n hi i am in the inner class of deepa and method of showGaurav()");
		}
	}
}
	


