
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		//displayArray(a,0);
	//	System.out.println(a.length);
		maxOfArray(a,5);
	}
	
	public static void displayArray(int a[],int idx) {
		if(idx==a.length) {
			return;
		}
		
//		System.out.println(a[idx]);
//		displayArray(a, idx+1);
	
		displayArray(a, idx+1);
		System.out.println(a[idx]);
		
	}
	
	
	public static int maxOfArray(int a[],int idx) {
		if(idx==a.length) {
			return idx;
		}
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<max) {
				max=a[i];
			}
		}
		maxOfArray(a, idx+1);
		return max;
	}

}
