
public class Main3 {

	public static void main(String[] args) {
		String s="garauava";
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<sb.length()-1;i++) {
			System.out.println(sb.append(sb.charAt(i)).reverse());
		}
	}
}
