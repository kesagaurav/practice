
public class Main {

	public static void main(String[] args) {

		// int sum=Integer.parseInt(str2)+Integer.parseInt(str2);
		String 	str = "1abc23";
		System.out.println(sum(str));
	}
	
	static int sum(String str) {

	
		String temp="0";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				temp+=ch;
			}else {
				temp+=Integer.parseInt(str);
				temp="0";
			}
		}
		return sum+Integer.parseInt(temp);
		
	}

}
