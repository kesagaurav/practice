
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 8 };

		int b = 2;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == b) {
				b = b + a[i];

			} else if (b == a[i+1]) {
				b = b + a[i+1];
			}

		}
		System.out.println(b);
		
		// count zeros in a matrx problem
		
		int A[][]={{0, 0, 0},
			     {0, 0, 1},
			     {0, 1, 1}};
		int c=0;
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A.length;j++) {
				if(A[i][j]==0) {
					c++;
				}
			}
		}
		System.out.println(c);
		
		
		// searching an element in array in java
		int d[]= {1,2,3,4,6};
		int k=6;
		int e=0;
		for(int i=0;i<d.length;i++) {
			if(d[i]==k) {
				e++;
			}
		}
		System.out.println( "  " + e);
		
	}

}
