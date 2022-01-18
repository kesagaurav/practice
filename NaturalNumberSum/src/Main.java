
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("  sum of natural nos are " + sumOfNaturalNos(5));
		System.out.println(" sum of digits using recursion " + sumOfDigitsUsingRecursion(9887));
		System.out.println(ropeLenght(23, 11, 9, 12));
		printSubsets("abc", "", 0);

	}

	public static int sumOfNaturalNos(int n) {
		if (n == 0)
			return 0;
		return n * (n + 1) / 2;
	}

	public static boolean isPalindrome(String s, int start, int end) {
		if (start >= end)
			return true;
		return (s.charAt(start) == s.charAt(end)) && isPalindrome(s, start + 1, end - 1);
	}

	public static int sumOfDigitsUsingRecursion(int n) {
		int sum = 0;
		if (n == 0)
			return 0;

		return sumOfDigitsUsingRecursion(n / 10) + n % 10;
	}

	public static int ropeLenght(int n, int a, int b, int c) {

		if (n == 0) {
			return 0;

		} else if (n < 0) {
			return -1;
		}

		int res = Math.max(ropeLenght(n - a, a, b, c),
				Math.max(ropeLenght(n - b, a, b, c), ropeLenght(n - c, a, b, c)));
		if (res == -1) {
			return -1;
		}
		return res + 1;
	}

	public static void printSubsets(String s, String curr, int index) {
		if (index == s.length()) {
			System.out.println(curr + " ");
			return;
		}
		printSubsets(s, curr, index + 1);
		printSubsets(s, curr + s.charAt(index), index + 1);
	}

}
