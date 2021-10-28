import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		// enter an string password atleatt 8 characters one upper one lower one digit
		String s="Kgaurav!1";
		//System.out.println(isValidPassword(s));
		int b1=0;
		int c1=0;
		int d1=0;
		int e1=0;
		
			for(int i=0;i<s.length();i++) {
				
			if(!Character.isLowerCase(s.charAt(i))) {
				
			
			}else if(!Character.isUpperCase(s.charAt(i))) {
				
			}else if(!Character.isDigit(s.charAt(i))) {
		
			}else if(!Character.isWhitespace(s.charAt(i))) {
				
			}else if(Character.isUpperCase(s.charAt(i))==true) {
				b1++;
			}else if(Character.isLowerCase(s.charAt(i))==true) {
				c1++;
			}else if(Character.isDigit(s.charAt(i))==true) {
				d1++;
			}else if(Character.isWhitespace(s.charAt(i))==true) {
				e1++;
			}

			}
			
			if(s.length()>=8) {
				if(b1>=1 && c1>=1 && d1>=1 && e1>=1) {
					System.out.println("\n password correct");
				}else {
					if(b1<1) {
						System.out.println("\n no lowercase");
					}if(c1<1) {
						System.out.println("\n no uppercase");
					}if(d1<1) {
						System.out.println("\n no digit");
					}if(e1<1) {
						System.out.println("\n no whitespace");
					}
				}
			}
			
			
			
		
	}
	
	
	static boolean isValidPassword(String password) {
		String s="[a-zA-z][0-9][@#$%^&+=]{8}";
		Pattern p=Pattern.compile(s);
		if(password==null) {
			return false;
		}
		
		Matcher m=p.matcher(password);
		return m.matches();
	}

}
