import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class Main {

	public static void main(String[] args) {
		
		String s="HelloWorld";
		char ar[]=s.toCharArray();			 //helloworld
											// the output should delloworlh
	
		
		
		char temp=ar[s.length()-1];
		ar[s.length()-1]=ar[0];
		ar[0]=temp;
		

		for(int i=0;i<s.length();i++) {
			System.out.printf(" %c", ar[i]);
		}
	}

}
