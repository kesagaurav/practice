import java.util.HashMap;
import java.util.Map;

public class ABC {
	
	static int a=10;

	public static void main(String[] args) {
//		System.out.println(Character.isLetter('y'));
//		System.out.println(Character.isLetter(9));
//		char ch='y';
//		boolean y=Character.isLetter(ch);
//		System.out.println(y);
		 
		Map<Integer,String> mp=new HashMap<>();
		mp.put(1,"gaurav");
		mp.put(2, "kesa");
		mp.put(3, "deepa");
		for(int i=0;i<mp.size();i++) {
			System.out.println(mp.keySet());
		}
		
		
		ABC a1=new ABC();
		System.out.println(a);
	
//		int a=4;
//		System.out.println(a++);
		
		
		
		
	}

}
