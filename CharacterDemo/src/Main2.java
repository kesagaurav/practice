
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aabb";
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			for(int j=1;j<s.length()-1;j++) {
				if(s.charAt(i)==s.charAt(j)) {
					sb.deleteCharAt(i);
				}
			}
			System.out.println(sb);
		}

	}

}
