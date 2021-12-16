
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{3,4}};
		int b[][]={{1,2},{3,4}};
		int c[][]=new int[2][2];
		 int n = 4;
	        int d[][] = { { 1, 2, 3, 4 },
	                      { 5, 6, 7, 8 },
	                      { 1, 2, 3, 4 },
	                      { 5, 6, 7, 8 } };
	        printPrincipalDiagonal(d, n);
	        printSecondaryDiagonal(d, n);
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<b.length;j++) {
//				 c[i][j]=a[i][j]+b[i][j]; // same for sub,mul,division
//				
//
//				 
//					System.out.println(c[i][j] + " " );
//
//			}
//
//		}
//		System.out.println("");
		

	}
	
	public static void printPrincipalDiagonal(int e[][],int n) {
		System.out.println("principal diagonal");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==j) {
					System.out.println(e[i][j] + " principla diagonal");
				}
			}
		}
	}
	public static void printSecondaryDiagonal(int e[][],int n) {
		System.out.println("principal diagonal");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if((i+j)==(n-1)) {
					System.out.println(e[i][j] + " secondary diagonal");
				}
			}
		}
	}

}
