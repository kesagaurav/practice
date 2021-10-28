package reducestring;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aaabccddd";
		StringBuilder sb=new StringBuilder(s);
		
			for(int i=0;i<s.length()-1;i++) {
				if(s.charAt(i)==s.charAt(i+1)) {
					sb.deleteCharAt(i);
				}
			}
			
			System.out.println();
			
		

	}

}
