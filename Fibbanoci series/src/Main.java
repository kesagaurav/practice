
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144;
		//System.out.println(fib(n));
	}

	
	static int fib(int n)  
	{  
	    int A[]=new int[0];  
	    A[0] = 0;
	    A[1] = 1;  
	    for(int i=2; i<=n; i++)  
	    {  
	         A[i] = A[i-1] + A[i-2] ; 
	    }  
	    return A[n];  
	}  
	
}
