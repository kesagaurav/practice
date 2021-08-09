import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {

	static int i;
	int j;
	
	static {
		 i=10;
		System.out.println("\n i am in static block");
	}
	
	int z=10;
	
	public static void main(String[] args) {

//		List<Integer> li=new ArrayList<Integer>();
//		li.add(1);
//		li.add(2);
//		li.add(3);
//		li.add(4);
//		Optional<Integer> li2=li.stream().max((a,b)->a.compareTo(b)); 
//		System.out.println( " the max is " + li2);
//		int x=5;
		System.out.println(Main.i);
		Main m=new Main();
		System.out.println(m.z);
		int a = 4;
		System.out.println(a++);
		
		int x = 1;
		System.out.print(x++);
		System.out.print(++x);
		try {
			
		}catch(Exception e) {
			try {
				
			}catch(Exception e1) {
				
			}
			
		}
	
	
	
	
	
	
	Map<Integer,String> m1=new HashMap<>();
	
	m1.put(1,"gaurav");
	
	Iterator<?> i;
	
	
	
	
	
	
	
	
	
	}

}
