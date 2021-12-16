
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanoi(3,10,11,12);

	}
	
	public static void hanoi(int n,int t1id,int t2id,int t3id) {
		if(n==0) {
			return;
		}
		hanoi(n-1,t1id,t3id,t2id);
		System.out.println(n + "t2id " + "t3id ");
		hanoi(n-1,t3id,t2id,t1id);
	}

}
