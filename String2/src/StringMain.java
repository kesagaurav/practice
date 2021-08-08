
public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toLower("GAURAV"));
		String s="gaurav";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length()-1));
		for(int i=0;i<s.length();i++) {
			if(i%2!=0) {
				System.out.println(s.charAt(i));
			}
		}
		
		String s1="    deepa gaurav     ";
		String[] a=s1.split(" ,");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i].trim().toString());
		}
		
		
		// string concat
		String b="gaurav";
		String c="deepa1";
		String d=b.concat(c);
		System.out.println(d);
		
		
		String g="surya";
		String v="gaurav1";
		String n=g.concat(v);
		char[] o=n.toCharArray();
		
		for(int i=n.length()-1;i>=0;i--)
			System.out.println(n.charAt(i));
		
		
		
		String s3="hi i am gaurav";
		for(int i=0;i<s3.length();i++) {
			System.out.println(s3.trim().toString().charAt(i));
		}

	
		String s4="deepa";
		for(int i=0;i<s4.length();i++) {
			System.out.println(s4.trim().toString().substring(i));
		}

		
		
		
	
	}
	
	public static String toLower(String b) {
		b.toLowerCase();
		System.out.println(b);
		return b; 
	}
	

}
