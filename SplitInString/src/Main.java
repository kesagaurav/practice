import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		int[] a = { 1, 3, 2, 4, 5, 6, 5, 6 };

		Arrays.stream(a).filter(u -> u % 1 == 0).forEach(e -> {
			if (e % 2 == 0) {
				System.out.println("even " + e);
			} else {
				System.out.println("odd " + e);
			}
		});

		Arrays.stream(a).filter(u -> u % 2 == 0).forEach(e -> System.out.println(e));

		String s = "gaurav";
		String a1 = s.toString();

		int b[] = { 1, 2, 2, 2, 3, 4, 5, 6, 6, 6 };
		// float y=Arrays.stream(a).distinct().count();

		System.out.println("\n streams using distinct in java");

		Arrays.asList(b).stream().distinct().collect(Collectors.toList());// .forEach(e->System.out.println(e));

		// stream().forEach(f->System.out.println(f.toString()));

	}

}
