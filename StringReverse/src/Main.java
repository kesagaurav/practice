
public class Main {

	public static void main(String[] args) {

		String s="hi my name is gaurav";
		System.out.println(s.length());
		System.out.println(s.length()-1);
		for(int i=s.length()-1;i>=0;i--) {
			System.out.printf("%s", s.charAt(i));
		}
	}

}
