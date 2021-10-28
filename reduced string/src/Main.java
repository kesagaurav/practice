
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabccddd";
		System.out.println(s.length()-1);
		StringBuilder sb=new StringBuilder(s);
		
		for(int i=0;i<sb.length()-1;i++) {
			if(sb.charAt(i)==sb.charAt(i+1)) {
				System.out.println(sb.delete(i, i+2));
				//i=0;
				//System.out.println(s.replace(sb, ""));
			}
		}

	}

}


//aaabccddd