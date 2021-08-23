
public class Employee {
	public int empid;
	public String name;
	public double salarly;
	public String designation;
	public Company company;

	public Employee() {
		super();
	}

	public Employee(int empid, String name, double salarly, String designation) {
		super();
		this.empid = empid;
		this.name = name;
		this.salarly = salarly;
		this.designation = designation;
		Thread t = new Thread();
		t.start();
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalarly() {
		return salarly;
	}

	public void setSalarly(double salarly) {
		this.salarly = salarly;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salarly=" + salarly + ", designation=" + designation
				+ "]";
	}


}





	class Employee2 extends Thread {

	public Employee employee2;

	public Employee2(Employee employee2) {
		super();
		this.employee2 = employee2;
	}

	@Override
	public void run() {
		employee2.getClass();

	}

}

