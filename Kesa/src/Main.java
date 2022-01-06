import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> li=new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		
		for(int i=0;i<li.size();i++) {
			System.out.println("the removed element is " + li.remove(li.size()-1));
		}
	}

}
