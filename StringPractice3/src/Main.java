
public class Main {

	public static void main(String[] args) {
		String s1="catcowcat";
		String s2="cat";
		int count=0;
		char a1[]=s1.toCharArray();
		char a2[]=s2.toCharArray();
		
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(a1[i]==a2[j]) {
					count++;
				}
			}
			
		}
		System.out.println("count is " + count );
	

	}

}
