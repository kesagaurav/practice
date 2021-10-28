
public class Main {
//	Original alphabet:      	abcdefghijklmnopqrstuvwxyz
//	Alphabet rotated +3:    	defghijklmnopqrstuvwxyzabc
//
//	Input 			String s and Rotation k
//
//	middle-Outz		rotate 2
//	Output 		okffng-Qwvb
//
//	There's-a-starman-waiting	rotate 3
//	Output		Wkhuh'v-d-vwdupdq-zdlwlqj
//	vwdupdq-zdlwlqj

	public static void main(String[] args) {
		
		String s="middle-Outz";
	
		int k=2;
		char ch;
		for(int i=0;i<s.length();i++) {
		 ch=s.charAt(i);
	
			if(Character.toLowerCase(ch)!=0) {
				ch+=k;
				
			}else if(Character.toUpperCase(ch)!=0) {
				ch+=k;
			}else if(Character.isLowerCase(ch)) {
				char ch1=122-25;
				
				ch=(char) (ch1 + k);
			}
			System.out.printf(" %c" , ch);
	
		}
		
		
		
		
		

	}

}
