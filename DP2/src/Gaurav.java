
public class Gaurav {
	
	public static void main(String[] args) {
			System.out.println(countNumberWithFour(14));
	}
	
	static int countNumberWithFour(int n) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(Character.isDigit(4)) {
				count++;
			}
		}
		return count;
	}
}
