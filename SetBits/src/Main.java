
public class Main {

	public static void main(String[] args) {

		int n=5,k=1;
		if((n&(1<<(k-1)))!=0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}

}
