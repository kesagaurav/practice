
public class A {

	private int id;
	private String name;
	private int accno;
	public A(int id, String name, int accno) {
		super();
		this.id = id;
		this.name = name;
		this.accno = accno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + ", accno=" + accno + "]";
	}
	
	
	
	
}
