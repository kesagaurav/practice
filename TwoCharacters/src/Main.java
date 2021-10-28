
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abaacdabd";
		StringBuilder sb=new StringBuilder(s);
		for(int i=0;i<sb.length()-1;i++) {
			for(int j=1;j<sb.length();j++) {
				
				if(sb.charAt(i)==sb.charAt(j)) {
					System.out.println(sb.delete(i, j));
				}
			}
		}

	}

}

//bdbd
