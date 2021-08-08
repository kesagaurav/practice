package arraypractice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,4,5,6,7,8,9,10};	
//		int n=12;
//		boolean prime=true;
//		for(int i=0;i<a.length;i++) {
//			System.out.println(" element at " + i + " the value is " + a[i]);
//		}
//		
//		for(int b=2;b<n;b++) {
//			if(n%b==0) {
//				prime=false;
//				break;
//			}
//		
//		
//		}
//		
//		System.out.println(prime);
	int c=0;
		for(int i=0;i<10;i++) {
		for(int k=1;k<=a[i];k++) {
			if(a[i]%k==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println(" " + a[i] + " is prime");
			c=0;
		}
		}
		
		
		
	}

}
