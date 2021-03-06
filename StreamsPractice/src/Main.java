import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		li.add(7);
		li.add(100);

		long a = li.stream().count();
		System.out.println(" the count is " + a);
		Optional<Integer> li3 = li.stream().max((p, q) -> p.compareTo(q));
		System.out.println("\n the maxmimum value is " + li3.get());
		Optional<Integer> li2 = li.stream().min((c, d) -> c.compareTo(d));
		System.out.println("the minimin elements are  " + li2.get());

		li.stream().filter(e -> {
			if (e % 2 == 0) {
				System.out.println("\n even " + e);
			} else {
				System.out.println("\n odd " + e);
			}
			if (e % 3 == 0) {
				System.out.println("Fizz");
			} else if (e % 5 == 0) {
				System.out.println("Buzz");
			} else if (e % 3 == 0 && e % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			return false;
		}).collect(Collectors.toList());
		
		//stream.of in java
		Stream<String> stream=Stream.of("A","B","C");
		boolean MathcedResult=stream.allMatch(e->e.startsWith("A"));
		System.out.println(MathcedResult);
	
		

	}

	
}
