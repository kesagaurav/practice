import java.security.Identity;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		s="hey";
		s="gaurav";
		System.out.println(s + System.identityHashCode(s));
		String s1=new String("gaurav");
		System.out.println(System.identityHashCode(s1));

	}

}
