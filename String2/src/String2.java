
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		String s="EkSoHwPqU";
//		String g="dJdIqNpQs";
//		String q=s.concat(g);
//		for(int i=q.length()-1;i>=0;i--)
//			System.out.println(q.charAt(i));
//		
//		String h="Lw";
//		System.out.println(h.length()-1);
//		for(int i=h.length()-1;i>=0;i--)
//			System.out.println(h.charAt(i));
		
		String a="kesa";
		int c=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==a.toUpperCase().charAt(i)) {
				c++;
			}
			System.out.println("\n no element is present");
	
		}
		
		System.out.println(c);
	
		
		System.out.println(conRev("gaurav", "deepa"));
		
//	String s="hello world !";
//	System.out.println(s.length()-1);
//	System.out.println(s.substring(0,s.charAt(0)));
//		
//	
	String str="abcde";
	str.trim();
	str.toUpperCase();
	str.substring(3, 4);
	System.out.println(str);
	
	int[] smaple= {8,5,3,1};
	System.out.println(smaple[2]);
	
	char myChar="piper".charAt(3);
	System.out.println(myChar);
	
	
	
	
	
	int d=1;
	int r=0;
	int y=d/r;
	System.out.println(y);
	
	String[] array=new String[] {"A","B,C"};
	
	
	
	
	
	
	
	
		
	}
	
	static String conRev(String s1,String s2) {
		String s3=s1.concat(s2);
		for(int i=s3.length()-1;i>=0;i--)
			System.out.println(s3.charAt(i));
		return s1.concat(s2);
		
	
	}

}
