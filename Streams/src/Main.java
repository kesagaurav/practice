import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number=new ArrayList<>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		
		Arrays.asList(number);
		System.out.println(number);
		boolean ans=number.stream().anyMatch(n->n%2==0);
		System.out.println(ans);
		
		 number.stream().filter(x->{
			 if(x%2==0) {
				 System.out.println("even " + x);
			 }else {
				 System.out.println("odd " + x);
			 }
			 return false;
		 }).forEach(e->System.out.println(e));
		 

		 long count=number.stream().count();
		 System.out.println(count);
		 
		 number.stream().distinct().forEach(e->System.out.println(" the distinct elements are " + e));
	
		int c= number.stream().reduce(0,(a,b)->a+b);
		System.out.println("the sum of elements in list are " + c);
		
		number.stream().map(x->x*x).forEach(e->System.out.println(" the prod of elements in list are " + e));
		//System.out.println("multiplication of elements are " + d);
		
		number.stream().map(x->x*x).filter(x->x%2==0).anyMatch(x->x%1==0);
		
	
	}

}
