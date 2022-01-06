
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 11;
		int n2 = 13;
		if (isTwinPrime(n1, n2)) {
			System.out.println("\n it is a twin prime");
		} else {
			System.out.println("\n not an twin prime");
		}

	}

	static boolean isPrime(int n) {
		int flag = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				flag += 1;
			}
		}
//		if(flag==2) {
//			System.out.println("\n prime " + n);
//		}else {
//			System.out.println("\n not prime " + n);
//		}
		return true;
	}

	static boolean isTwinPrime(int n2, int n3) {
		if (isPrime(n2) && isPrime(n3) && Math.abs(n2 - n3) == 2) {
			return true;
		} else {
			return false;
		}
	}

}
