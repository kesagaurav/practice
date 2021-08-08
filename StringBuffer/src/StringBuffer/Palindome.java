package StringBuffer;

public class Palindome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPalindromeDetailedWay("madam"));
		System.out.println(isPalindromeDetailedWay("121"));
		System.out.println(isPalindromeDetailedWay("rotor"));
		System.out.println(isPalindromeDetailedWay("12101010"));



	}

	public static boolean isPalindromeDetailedWay(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String s1=sb.toString();
		return s.equals(s1);
	}
	
	public static boolean isPalindromeShortHand(String s) {
		return new StringBuilder(s).reverse().toString().equals(s);
	}
	
	
}
