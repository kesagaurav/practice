import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		List<Integer> li=new ArrayList<>(n);
		for(int i=1;i<=n;i++) {
			li.add(i);
		}

		for(int i=0;i<=li.size();i++) {
			
			//	System.out.println(" the remaing elemenets are " + li.get(i));
				System.out.println(li.size());
				li.removeIf(a->a%2==0);
				System.out.println(" the remaning elemensts are  " + li);
				
		}
		
		List<Integer> li2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,-1,-2,-3));
		li2.removeIf(num->num%2==0 || num<0 );
		System.out.println(li2);
		
		
		//cosnumer
		Consumer<Integer> consumer=t->System.out.println("printing the consumer " + t);
		consumer.accept(10);
		
		li.forEach(t->System.out.println("ok"));
		// predicate and interdimate operations
		li.stream().map(x->x*x).filter(x->x%2==0).anyMatch(x->x%2!=1);
		// supplier
		List<Integer> li3=new ArrayList<>(Arrays.asList(1,2,3));
		System.out.println(li3.stream().findAny().orElseGet(()->li3.get(1)));
		List<Integer> li4=new ArrayList<>(Arrays.asList(1,2,3));
		li4.contains(li4.get(2).MAX_VALUE);
		
		
	}

}
