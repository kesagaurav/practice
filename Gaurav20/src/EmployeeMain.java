import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "gaurav", 300.0, 23, "male", 2, "warangal"));
		empList.add(new Employee(2, "depa", 400.0, 26, "female", 1, "adilabhad"));
		empList.add(new Employee(3, "jai", 3200.0, 25, "male", 0, "mumbai"));
		empList.add(new Employee(4, "omakr", 3330.0, 22, "male", 12, "pune"));
		empList.add(new Employee(5, "deepthi", 200.0, 23, "female", 0, "chennai"));
		empList.add(new Employee(6, "himanshu", 100.0, 26, "male", 3, "bangalore"));
		empList.add(new Employee(7, "kingpin", 4200.0, 25, "male", 0, "maharashtra"));
		empList.add(new Employee(8, "raj", 3350.0, 22, "male", 5, "warangal"));
		empList.forEach(e -> System.out.println(e));
		System.out.println("searching the city based on warangal");
		empList.stream().filter(e -> e.getCity().contains("warangal")).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("\n converting an list to map using two feilds id and name");
		Map<Integer, String> map = new HashMap<>();
		for (Employee e : empList) {
			map.put(e.getId(), e.getName());
		}
		System.out.println(map);

		System.out.println("\n converting list to maps using streams");
		Map<String, Double> map2 = empList.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalarly));
		map2.forEach((x, y) -> System.out.println(x + " = " + y));
		// System.out.println(" the name and salary are " + map2);

		System.out.println("\n converting list to map using groupby in streams");
		// empList.stream().collect(Collectors.groupingBy(Employee::getId,Collectors.mapping(Employee::getExperience,
		// Collectors.toList())));
		Map<Integer, List<Integer>> map3 = empList.stream().collect(Collectors.groupingBy(Employee::getId,
				Collectors.mapping(Employee::getExperience, Collectors.toList())));
		map3.forEach((x, y) -> System.out.println(x + " = " + y));
		
		Map<String,List<Double>> map4=empList.stream().filter(e->e.getSalarly()>300.0).collect(Collectors.groupingBy(Employee::getName,Collectors.mapping(Employee::getSalarly, Collectors.toList())));
		map4.forEach((x,y)->System.out.println(x + " = " +  y));

	}

}
