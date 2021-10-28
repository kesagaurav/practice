import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int ar[]= {8,3,1,2};
//		int n=3;
//		int m=ar.length;
//		int N=3;
//		int[] numCoins = new int[N+1];
//		int coins[]=new int[3];
//		for(int i = 0; i < coins.length; i++) {
//	        for(int j = coins[i]; j < numCoins.length; j++) {
//	            numCoins[j] += numCoins[j - coins[i]];
//	        }
//		}
//

//		Set<Character> st=new LinkedHashSet<>();
//		String s="abcaba";
//		StringBuilder sb=new StringBuilder();
//		for(int i=0;i<s.length();i++) {
//////			s.chars().distinct().forEach(e->sb.append((char) e));
////		s.chars().distinct().forEach(e->sb.append((char) e));
////		System.out.println(s.chars());
//			st.add(s.charAt(i));
//		}
//		
//		for(Character c:st) {
//			sb.append(c);
//			System.out.println(sb.append(c));
//		}
		
		
		String s="12345678";
		int N=5;
		int sum=0;
		
		for(int i=0;i<s.length();i++) {
			sum+=s.charAt(i)%N;
			//int a=sum%N;
			
			
			
		}
		System.out.println(sum);
		
		int i=Integer.parseInt(s);
		sum+=i%N;
		System.out.println(sum);
		
		
	}	

	
}
	



