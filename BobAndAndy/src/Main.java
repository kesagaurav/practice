import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int arr[]= {10,20,2,20000};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				System.out.println("max of an array is " + max);
			}
		}
	}
	
}
