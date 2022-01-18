
public class Main {

	public static void main(String[] args) {
		int n=10;
		int s=0;
		int s1=1;
		int sum=0;
		for(int i=2;i<=n;i++) {
			sum=s+s1;
			s=s1;
			s1=sum;
		}
	//	System.out.println(sum + "");
		perfectNumber(28);
		perfectSquare(4);
		
	}
	
	public static void perfectNumber(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println("perfect number");
		}else {
			System.out.println("\n not an perfect number");
		}
	}
	
	
	public static void perfectSquare(int n) {
		for(int i=1;i<n;i++) {
			if(i*i==n) {
			System.out.println("it is a perfect square " + n);	
			break;
			}
		}
		
		
	}

}
