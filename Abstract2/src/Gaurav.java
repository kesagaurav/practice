
public abstract  class Gaurav {

	private int rollno;
	private String name;
	
	public Gaurav() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gaurav(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Gaurav [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
	public abstract void callGaurav();
	
	
	public void getName1() {
		System.out.println("\n hi i am in the abstract class of gaurav");
	}
	
	public void show() {
		System.out.println("\n i am gaurav abstract class");
	}
	
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	
	
}
