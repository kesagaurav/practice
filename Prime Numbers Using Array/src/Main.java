
public class Main {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		//System.out.println(a.length);
		int c;
		for (int i = 1; i <= a.length - 1; i++) {
			c=0;
			for (int j = 2; j < i ;j++) {
				if (i % j == 0)
					c++;
				break;

			}
			if (c == 2) {
				System.out.println("is prime ");
			}

		}

	}

}
