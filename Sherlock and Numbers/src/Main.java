
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(status(3, 9));
		System.out.println(status(17,24));
	

	}

	public static int status(int a, int b) {
		int count = 0;
		int sq = 0;
		for (int i = a; i <= b; i++) {
			double d = Math.sqrt(i);

			sq = (int) d;
			if (sq * sq == i) {
				count++;
			}

		}
		return count;
	}

}
