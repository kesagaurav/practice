import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(35);
		li.add(40);
		li.add(11);
		li.add(21);
		li.add(33);
		li.add(45);
		
		for(int i=0;i<li.size();i++) {
			if(li.get(i)%2==0) {
				System.out.println("\n even " + li.get(i));
			}else if(li.get(i)==1) {
				System.out.println("\n odd " + li.remove(i));
			}
		}

	}

}
