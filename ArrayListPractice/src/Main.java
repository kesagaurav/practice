import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
	
		li.add(7);
		li.add(8);
		li.add(9);
		li.add(10);
		li.add(1);
		li.add(2);
		li.add(3);
	
	System.out.println();
	Collections.sort(li);
	li.stream().filter(i->i%2==0).forEach(e->System.out.println(e));

		int sum=0;
//		for(int i=0;i<li.size();i++) {
//			if(li.get(i)%2==0) {
//				System.out.println("\n even " + li.remove(i));
//			}else {
//				System.out.println("\n odd " + li.get(i));
//			}
//		
//			System.out.println(sum);
//			System.out.println("\n the last index is " + li.lastIndexOf(3));
//			
//		}
//		
	
		
	

	}

}
