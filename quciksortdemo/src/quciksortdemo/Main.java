package quciksortdemo;

public class Main {

	public static void main(String[] args) {
		int a[]= {34,26,1,45,18,78,12,89,28};
		
		quicksort(a,0,8);
		System.out.println("\n the sorted array is");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		

	}
	
	public static void quicksort(int a[],int low,int high) {
		int p;
		if(low<high) {
			p=partition(a,low,high);
			quicksort(a,low,p-1);
			quicksort(a,p+1,high);
			
		}
	}
	
	public static int partition(int a[],int low,int high) {
		int i,j,pivot,temp;
		
		pivot=a[low];
		i=low;
		j=high;
		
		while(i<j) {
			while(a[i]<=pivot)
				i++;
			while(a[j]>pivot)
				j--;
			
			if(i<j) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		temp=a[low];
		a[low]=a[j];
		 a[j]=temp;
		
		 return j;
		
		
	}

}
