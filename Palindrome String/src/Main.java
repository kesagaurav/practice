import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam",rev="";
		//StringBuilder sb=new StringBuilder(s);
		int a[]= {1,1,2,3};
		countDistinct(a);
		int c=0;
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		if(rev.equals(s)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palinndrome");
		}
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1] && a[i]!=a[i+1]) {
				c++;
			}
			System.out.println("count is " + c);

		}
			
	}
	
	public static int countDistinct(int b[]) {
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<hs.size();i++) {
			hs.add(b[i]);
		}
		return hs.size();
	}

}
