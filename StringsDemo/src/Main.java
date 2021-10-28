
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="gaurav";
		String s2=new String("gaurav");
		String s3=s2.intern();
		System.out.println("the strings s1 and s2 are " + s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3);
		
		int a[]= {1,2,3};
		System.out.println(a[3]);
		
		
	}

}
