
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printDecreasing(5);
//		printIncreasing(5);
//		printIncreasingDecreasing(3);
		printLopps(200);

	}
	
	
//	public static void printDecreasing(int n) {
//		if(n==0) {
//			return;
//		}
//		System.out.println(n);
//		printDecreasing(n-1);
//	}
//	
//	public static void printIncreasing(int n) {
//		if(n==0) {
//			return;
//		}
//		
//		printIncreasing(n-1);
//		System.out.println(n);
//	}
	
	
	public static void printIncreasingDecreasing(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printIncreasingDecreasing(n-1);
		System.out.println(n);
		
		
	}
	
	public static void printLopps(int n) {
		if(n==0) {
			return;
		}
		printLopps(n-1);
		System.out.println(n + "");
		
	}
	

}
