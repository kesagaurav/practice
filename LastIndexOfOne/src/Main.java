
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "00001";
		int c = 0;
		boolean flag = false;

//		for(int i=s.length()-1;i>=0;i--) {
//			if(s.charAt(i)=='1') {
//				c++;
//			}
//		}
//		if(flag==false) {
//			int d=-1;
//		}
//		System.out.println(c);

		// searching an element array in java
		int b[] = { 1, 2, 3, 4, 5 };
		int x = 5;

		for (int i = 0; i < b.length; i++) {
			if (b[i] == x) {
				x = i;
			}
		}
		System.out.println(x);
		// find only one occurence
		int e[] = { 1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65 };
		int f = 0;
		for (int i = 0; i < e.length - 1; i++) {
			if (e[i] != e[i + 1]) {
				f = e[i];
				break;
			}

		}
		if (e[e.length - 2] != e[e.length - 1])
			f = e[e.length - 1];
		System.out.println(f);
		
		
		// retreving firts and last index of array in java
		int t[]= {1,3,3,4};
		int o=3;
		for(int i=0;i<t.length-1;i++) {
			for(int j=t.length-1;i>=0;i--) {
				if(t[i]==o) {
					o=i;
					System.out.println("found at position " + i);
					break;
				}else if(t[j]==o){
					o=i;
					System.out.println("found at position " + j);
					break;

				}
			}
		}
		


	}
}


