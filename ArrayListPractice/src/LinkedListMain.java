import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

	public static void main(String[] args) {
		List<Integer> i=new LinkedList<>();
		int r=0;
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(null);
		for(int a=0;a<i.size();a++) {
			System.out.println(i.get(a));
		}

	}

}
