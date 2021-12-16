
public class Main {

	public static void main(String[] args) {
		String s="SOSTOS";
		
	}
	
	
	public static int marsExploration(String s) {
		int a=0;
		String s2="";
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s.charAt(i)!=s2.charAt(j)) {
					a++;
					a=s.length()/a;
				}
			}
		}
		return a;
		
	}

}
