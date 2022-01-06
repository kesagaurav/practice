import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

		private int a=10;
		private int b=10;
		
		static int add(int a,int b) {
			return a + b;
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main.add(3,	 4);
		Main m=new Main();
		System.out.println(m.add(3, 2));
		
		Set<Integer> li=new HashSet<>();
		li.add(1);
		li.add(2);
		li.add(3);
		
		
	}

}
