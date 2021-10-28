
public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="oneTwoThree";
		int c=0;
		
		for(int i=0;i<s.length()-1;i++) {
			if(s.toUpperCase().charAt(i)!=0) {
				c++;
			}
		}
		System.out.println(c);

	}

}
