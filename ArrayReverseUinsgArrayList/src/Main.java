import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> li=new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		
		System.out.println(reverseArray(li));
		System.out.println(rotateArray(li, 2));
		
	}
	
	public static List<Integer> reverseArray(List<Integer> a){
		List<Integer> b=new ArrayList<>();
		for(int i=a.size()-1;i>=0;i--) {
			b.add(a.get(i));
		}
		return b;
		
	}

	

	public static List<Integer> rotateArray(List<Integer> a,int d){
		List<Integer> b=new ArrayList<>();
		for(int i=0;i<a.size();i++) {
			b.add(a.get(i));
			Collections.rotate(b, d);
		}
		return b;
		
	}
	
	
	
}
