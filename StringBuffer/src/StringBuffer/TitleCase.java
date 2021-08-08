package StringBuffer;

public class TitleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello hi good noon we got thread safety";
		System.out.println(convertToTitleCase(s));
	}
	
	public static String convertToTitleCase(String s) {
		String ar[]=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int w=0;w<ar.length;w++) {
			sb.append(Character.toUpperCase(ar[w].charAt(0))).append(ar[w].substring(1)).append(" ");
		}
		return sb.toString().trim();
	}

}
