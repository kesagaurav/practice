
public class Main {

	public static void main(String[] args) {
	
		try {
			int a = 1;
			int b = 0;
			int c = a / b;
			System.out.println( "the result is " + c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("\n i am in finally method");
		}

	}

}
