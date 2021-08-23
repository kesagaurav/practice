import java.util.Scanner;

import com.gaurav.model.Employee;
import com.gaurav.service.EmployeeService;
import com.gaurav.service.impl.EmployeeServiceImpl;
import com.gaurav.service.impl.EmployeeServiceImpl3;

public class Main {

	public static void main(String[] args) {

		int ch = 0;
		Employee e = new Employee();
		Scanner scan = new Scanner(System.in);
		EmployeeService emp = new EmployeeServiceImpl();
		EmployeeServiceImpl emp2 = new EmployeeServiceImpl();
		EmployeeServiceImpl3 emp3 = new EmployeeServiceImpl3(emp2);
		emp3.start();
		do {
			System.out.println("\n 1.create");
			System.out.println("\n 2.update");
			System.out.println("\n 3.delete");
			System.out.println("\n 4.exit");
			try {
				ch = Integer.parseInt((scan.nextLine()));
			} catch (NumberFormatException e1) {
				e1.getStackTrace();
			}
			switch (ch) {
			case 1:
				System.out.println("\n create an emplyee with following below details");
				System.out.println("\n plz enter ur name");
				e.setName(scan.nextLine());
				System.out.println("plz enter your designation");
				e.setDesignation(scan.nextLine());
				System.out.println("\n plz enter your salarly");
				e.setSalarly(Double.parseDouble(scan.nextLine()));

				emp.createEmployee(e);
				break;
			case 2:
				System.out.println("\n update an employee with following details");
				System.out.println("plz enter your id");
				int emp_id=Integer.parseInt(scan.nextLine());
				System.out.println("\n plz enter your salarly");
				Double salarly=Double.parseDouble(scan.nextLine());
				System.out.println("\n plz enter your designation");
				String designation=scan.nextLine();
				emp.updateEmployee(emp_id,salarly, designation);
				
				break;
			case 3:
				System.out.println("\n delete from employee");
				System.out.println("\n plz enetr an id to delete");
				int emp_id1=Integer.parseInt(scan.nextLine());
				emp.deleteEmployee(emp_id1);
				break;
			case 4:
				System.out.println("\n thankyu visiit again----------:)");
				break;
			default:
				System.out.println("\n enter nos only (1-4) only");
				break;
			}

		} while (ch != 4);

		scan.close();

	}

}
