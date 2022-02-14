package permutations;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		printPermutations(str, "");
	}
	
	public static void printPermutations(String str,String asf) {
		if(str.length()==0) {
			System.out.println(asf);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String str2=str.substring(0,i);
			String str3=str.substring(i+1);
			String str4=str2+str3;
			printPermutations(str4, asf+ch);
		}
	}

}
