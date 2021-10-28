
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t1[]=new int[]{45,40,30};
		int t2[]=new int[] {30,45,30};

		
		for(int i=0;i<3;i++) {
			if(t1[i]<t2[i]) {
				System.out.println("\n akshay wins");
			}else if(t1[i]==t2[i]) {
				System.out.println("\n tie");
			}else if(t1[i]>t2[i]) {
				System.out.println("\n gaurav wins");
			}
		}
		
		
		
		
		
		

	}

}
