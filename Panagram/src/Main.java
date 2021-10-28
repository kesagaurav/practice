
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="We promptly judged antique ivory buckles for the next prize ";
		System.out.println(isPanagram(s));

	}
	
	public static String isPanagram(String s) {
		
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)=='a'&& s.charAt(i)=='b'&&s.charAt(i)=='c'&&s.charAt(i)=='d'
					&&s.charAt(i)=='e'&&s.charAt(i)=='f'&&s.charAt(i)=='g'&&s.charAt(i)=='h'&&s.charAt(i)=='i'
					&&s.charAt(i)=='j'&&s.charAt(i)=='k'&&s.charAt(i)=='l'&&s.charAt(i)=='m'&&s.charAt(i)=='n'&&s.charAt(i)=='o'
					&&s.charAt(i)=='p'&&s.charAt(i)=='q'&&s.charAt(i)=='r'&&s.charAt(i)=='s'&&s.charAt(i)=='t'
					&&s.charAt(i)=='u'&&s.charAt(i)=='v'&&s.charAt(i)=='w'&&s.charAt(i)=='x'&&s.charAt(i)=='y'
					&&s.charAt(i)=='z') {
				
			}else if(s.charAt(i)=='A'&& s.charAt(i)=='B'&&s.charAt(i)=='C'&&s.charAt(i)=='D'
					&&s.charAt(i)=='E'&&s.charAt(i)=='F'&&s.charAt(i)=='G'&&s.charAt(i)=='H'&&s.charAt(i)=='I'
					&&s.charAt(i)=='J'&&s.charAt(i)=='K'&&s.charAt(i)=='L'&&s.charAt(i)=='M'&&s.charAt(i)=='N'&&s.charAt(i)=='O'
					&&s.charAt(i)=='P'&&s.charAt(i)=='Q'&&s.charAt(i)=='R'&&s.charAt(i)=='S'&&s.charAt(i)=='T'
					&&s.charAt(i)=='U'&&s.charAt(i)=='V'&&s.charAt(i)=='W'&&s.charAt(i)=='X'&&s.charAt(i)=='Y'
					&&s.charAt(i)=='Z') {
				
			} 
			
		}
			
		if(s.length()==26) {
			return "yes";
		}
		
		return "no";
		
		
		
		
		
		//return "no";
		
	}

}
