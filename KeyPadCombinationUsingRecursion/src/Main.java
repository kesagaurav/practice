import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		ArrayList<String> words=getPKC(s);
		System.out.println(words);

	}
	static String[] codes= {";","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	public static ArrayList<String> getPKC(String s) {
		char ch=s.charAt(0);
		String ros=s.substring(1);
		 ArrayList<String> res=getPKC(ros);
		 ArrayList<String> mres=new ArrayList<>();
		 String code=codes[ch];
		 for(int i=0;i<code.length();i++) {
			 char ch2=code.charAt(i);
			 for(String rstr:res) {
				 System.out.println(ch2 + rstr);
			 }
		 }
		 
		return mres;
		 
		
	}

}
