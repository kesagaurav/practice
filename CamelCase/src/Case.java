
public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="one two three";
		System.out.println(convertToTitleCase(s));
		s.charAt(0);
		String letter=Character.toString(s.charAt(0));

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
