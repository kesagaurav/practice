
public class Main {

	//1 1
//	1 2
//	1 3
//	2 3
//	2 2
//	2 1
//	3 1
//	3 2
//	3 3
//	3,1	3,2	3,3

	
	public static void main(String[] args) {
		int row=3;
		int col=3;
		int [] [] ar= {
				{1,1},
				{1,2},
				{1,3},
				{2,1},
				{2,2},
				{2,3},
				{3,1},
				{3,2},
				{3,3}
		};
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("ar[" + i+1 +  "]["+j+1+"]"+ar[i][j]);
			}
		}
		
	}

}
