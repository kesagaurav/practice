import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class Gaurav {

	public static void main(String[] args) {
	// now array dequeu operations
	Deque<Integer> deque=new ArrayDeque<>();
	deque.add(10);
	deque.add(20);
	deque.add(30);
	deque.add(40);
	System.out.println(deque.size());
	
//	
//	for(Integer i :deque) {
//		System.out.println(i.toString());
//	}
	
	for(Iterator itr=deque.iterator();itr.hasNext();) {
		System.out.println(itr.next());
	}
	
	}
	
}
