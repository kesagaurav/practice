
public class A {

	private String name;
	private int rollno;
	protected A(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "A [name=" + name + ", rollno=" + rollno + "]";
	}
	
	
	
	
}
