import java.util.*;

public class Main {

	public static void main(String[] args) {

		List<Integer> li=new ArrayList();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(10);
		
		li.parallelStream().distinct().forEach(e->System.out.println(e));
		
	}

}
