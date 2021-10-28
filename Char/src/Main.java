
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s="The quick brown fox jumps over the dog";
		s=s.toLowerCase();
		boolean flag=true;
		for(char ch='a';ch<='z';ch++) {
			if(s.indexOf(ch)==-1) {
				flag=false;
				break;
			}
		}
				if(flag) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
		
	}

}
