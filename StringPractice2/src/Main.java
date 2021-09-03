
public class Main {

	public static void main(String[] args) {
		String s="AbCD";
		System.out.println(modify(s));
	}
	
	static String modify(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==s.toLowerCase().charAt(i)) {
				System.out.println(s.substring(0).toLowerCase());
				
			}
			else {
				if(s.charAt(i)==s.toUpperCase().charAt(i)) {
					System.out.println(s.substring(i).toUpperCase());
				}
			}
			
		}
		
		
		return s;
	}
	
}
