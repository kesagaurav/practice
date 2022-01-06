
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindorme("madam"));
		System.out.println(isPalindorme("2222"));
	}

	public static boolean isPalindorme(String s) {
		return new StringBuilder().append(s).reverse().toString().equals(s);
	}

}
