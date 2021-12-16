
public class Main {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int flag=0;
		
		for(int i=1;i<=a.length-1;i++) {
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println("\n it is prime " + i);
			}else {
				System.out.println("\n not a prime " + i);
			}
			
			
			
		}
	
		
		
	}

}
