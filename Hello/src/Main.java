
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n hi welcome to the java programming");
		
		String s[]= {"gauarav"};
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length;i++) {
			sb.append(s[i].substring(0, s[i].length()-1)).append(Character.toUpperCase(s[i].charAt(s[i].length()-1))).append(" ");
			
	}
		
		System.out.println(sb);

		
		//[101,22,300,400]
		// and output is [300,400]
		// int a[]={101,22,300,400};
}
}
