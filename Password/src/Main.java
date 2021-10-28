
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s="aB1&";
//System.out.println(s.matches("[a-zA-Z][0-9]{1}[$&+,:;=?@#|'<>.-^*()%!]{6}"));
		System.out.println(minimumNumber(6, "gA1$a"));
		
	}
	
	
	 public static int minimumNumber(int n, String password) {

		  n=password.length();
		  for(int i=0;i<n;i++) {
			  System.out.println(password.matches("[a-zA-Z][0-9][$&+,:;=?@#|'<>.-^*()%!]{1}"));
		  }
		 
		 
		  
		  
		  return 0;
		    }
	
	

}
