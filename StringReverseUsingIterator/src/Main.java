import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindromeShortHand("madam"));
		System.out.println(isPalindromeShortHand("gaurav"));
		System.out.println(convertToTitleCase("hi i am safe and thread safety"));

		List<String> li = new ArrayList<>();
		li.add("ravi");
		li.add("vinay");
		li.add("zia");
		li.add("chandra");
		li.add("ajay");
		li.add("gaurav");
		System.out.println("\n traversing through the list in java");
		ListIterator<String> li1 = li.listIterator(li.size());
		for (int i = 0; i < li1.nextIndex(); i++) {

			while (li1.hasPrevious()) {
				String str = li1.previous();
				System.out.println(str);
			}

		}

		List<Integer> li2 = new ArrayList<>();
		li2.add(1);
		li2.add(2);
		li2.add(3);
		li2.add(4);
		
		String s1="gauravaa";
		int c=1;
		for(int i=0;i<s1.length()-1;i++) {
			for(int j=i+1;j<s1.length()-1;j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					c++;
				}
			}
		}
		System.out.println(c);
		
		
		

	}

	public static boolean isPalindromeShortHand(String s) {

		return new StringBuilder(s).reverse().toString().equals(s);
	}
	
	public static String convertToTitleCase(String s) {
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for (int w = 0; w < ar.length; w++) {
			sb.append(Character.toUpperCase(ar[w].charAt(0))).append(ar[w].substring(1)).append(" ");
		}
		return sb.toString().trim();
	}

}
