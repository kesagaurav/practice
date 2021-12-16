
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30, 10 };
		int c = 0;
		for (int i = 0; i < a.length; i++) {

		}
		int d=3;
		int f1=firstIndex(a, 0, d);
		System.out.println(f1);
	}

	public static int firstIndex(int a[], int idx, int x) {
		if (idx == a.length) {
			return -1;
		}
		if (a[idx] == idx) {
			return idx;
		} else {
			int fisa=firstIndex(a, idx+1, x);
			return fisa;
		}
	}

}
