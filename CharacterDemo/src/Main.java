
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="gaurav";
		StringBuilder sb=new StringBuilder(s);
		
		sb.deleteCharAt(s.length()-1);
		
		sb.deleteCharAt(0);
		
		System.out.println(sb);
		
	}

}
