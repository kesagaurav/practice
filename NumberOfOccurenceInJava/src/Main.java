
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 1, 2, 2, 2, 2, 3 };
		numberOccurences(a, 7, 4);
	}

	public static void numberOccurences(int a[], int n, int x) {
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				c++;
			}
		}
		System.out.println(" not found " + c);
	}

}
