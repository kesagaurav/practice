
public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = power(2, 3);
		System.out.println(a);
		int b=power2(10,8);
		System.out.println(b);
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int a = power(x, n - 1);
		int b = x * a;

		return b;
	}

	//calculate power using logarithamic
	public static int power2(int x,int n) {
		if(n==0) {
			return 1;
		}
		int b=power(x,n/2);
		int c=b*b;
		if(c%2==1) {
			c=b*x;
		}
		return c;
	}
	
}
