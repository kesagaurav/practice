
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int k=3;
		int sum=0;
		
		int dp[][]= {{1,2,3,4,5},{3}};
		
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp.length;i++) {
				j=k*(k-1);
				sum=k+j;
				
			}
			
			i=k*(k-1);
			sum+=sum;
			
		}
		System.out.println(sum);
		

	}

}
