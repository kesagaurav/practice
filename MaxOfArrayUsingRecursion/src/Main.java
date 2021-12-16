
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30};
		for(int i=0;i<a.length;i++) {
			
		}
		int max=maxofArray(a,0);
		System.out.println( " max value is  " + max);
		

	}
	
	public static int maxofArray(int a[],int idx) {
		if(idx==a.length-1) {
			return a[idx];
		}
		int max=maxofArray(a, idx+1);
		if(max>a[idx]) {
			return max;
		}else {
			return a[idx];
		}
		
	
		
	}

}
