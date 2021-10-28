
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="hello";
		String s2="world";
		
		for(int i=0;i<s1.length()-1;i++) {
			for(int j=0;j<s2.length()-1;j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					System.out.println("yes");
				}
			}
		}
		
		//System.out.println("no");
		

	}

}
