
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30, 10 };
		int c = 0;
		for (int i = 0; i < a.length; i++) {

		}
		int d=10;
		int f1=lastIndex(a, 0, d);
		System.out.println(f1);
	}
	
	public static int lastIndex(int a[], int idx, int x) {
		if(idx==a.length) {
			return -1;
		}
		int lisa=lastIndex(a, idx+1, x);
		if(lisa==-1) {
			if(a[idx]==x) {
				return idx;
			}else {
				return -1;
			}
		}else {
			return lisa;
		}
		
	}


}
