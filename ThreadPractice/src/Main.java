public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Thread t1 = new Thread();
		employee.setEmpid(1);
		employee.setName("gaurav");
		employee.setDesignation("associate");
		employee.setSalarly(300.00);
		Employee2 emp = new Employee2(employee);
		emp.start();
		System.out.println(emp.toString());

	}

}
