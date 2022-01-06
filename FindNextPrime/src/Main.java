
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		// int a=n+1;
		int flag = 0;

		for (int a = n + 1;; a++) {

			for (int i = 2; i < a; i++) {

				if (a % i == 0) {
					flag = flag + 1;
					
				}

			}
			if (flag == 0) {
				System.out.println("\n  next prime no is " + n);
				break;
			} else {
				System.out.println("\n  no prime " + n);

			}
		}

	}
}
