
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,2,1,3,5};
		int k=0;
		int sum=1;
		int sum1=0;
		int x=4;
		for(int i=0;i<x-1;i++) {
			sum+=a[i];
		}
		
		for(int i=0;i<x;i++) {
			sum1+=a[i];
		}
		
		System.out.println(sum + " " + sum1);
	
	}

}
