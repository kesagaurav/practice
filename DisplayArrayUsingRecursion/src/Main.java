
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30};
		for(int i=0;i<a.length;i++) {
			
		}
		displayArr(a,0);
		//System.out.print(displayArr(a, 5));

	}

	// this is for displaying an array
//	public static void displayArr(int a[],int idx) {
//		if(idx==a.length) {
//			return;
//		}
//		System.out.println(a[idx]);
//		displayArr(a,idx+1);
//		
//	}
	
	// this is for reversing an array
	
	public static void displayArr(int a[],int idx) {
		if(idx==a.length) {
			return;
		}
		
		displayArr(a,idx+1);
		System.out.println(a[idx]);
		
	}
	
}
