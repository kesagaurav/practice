
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{1,2},{3,4},{5,6}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(a[i][j]);
			}
		}
		
		System.out.println("\n the addtion of array are");
		int b[][]= {{1,2,3},{3,4,5},{5,6,7}};
		int c[][]= {{7,8,9},{9,9,10},{11,12,12}};
		int d[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			 d[i][j]=b[i][j]+c[i][j]; // you can do for some arthemetic operations(+,-*,/)
			 System.out.println(d[i][j]);
			}
			System.out.println();
		}
		

	}

}
