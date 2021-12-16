import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numbers=new Integer[] {1,2,3,4,5,3,3,4};
		Set<Integer> set=new HashSet<>();
		Set<Integer> n1=Arrays.stream(numbers).filter(n->!set.add(n)).collect(Collectors.toSet());
		System.out.println(n1);
		// the same example using counting collectors
	boolean a=	Stream.of(1, 3, 4, 6, 7, 5, 6)
        .collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()))
        .entrySet().stream().anyMatch(e -> e.getValue() > 1);
		System.out.println(a);
		
		List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8,9);
		Collections.sort(li.subList(2, 3));
		System.out.println(li);
		
		for(int i=0;i<li.size()-1;i++) {
			Collections.sort(li.subList(i, i+1));
		}
		

	}

}
