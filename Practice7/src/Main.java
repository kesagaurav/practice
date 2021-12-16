import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


	public static void main(String[] args) {

		List<Integer> li=new ArrayList<>();
		li.add(5);
		li.add(3);
		li.add(7);
		li.add(9);
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		List<Integer> li2=li.stream().filter(o->o%2!=0).map(y->y*y).collect(Collectors.toList());
		for(int i=0;i<li2.size();i++) {
			System.out.printf("\t " +   li2.get(i));
		}
		
	
	}

}
