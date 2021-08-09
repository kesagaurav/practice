
public class Main {

	public static void main(String[] args) {
		String s=" hi my name is gaurav";
		StringBuffer sb=new StringBuffer();
		sb.append(s).reverse().charAt(0); // this is the append function
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("gaurav");
		sb1.insert(6,"deepa");// this is for insert method
		System.out.println(sb1);
		
		StringBuilder sb2=new StringBuilder("gaurav");
		sb2.indexOf(s,1);
		System.out.println(sb2); // this is index of
		
		
		StringBuilder sb3=new StringBuilder("gaurav");
		sb3.lastIndexOf(s,'v');
		System.out.println(sb3); // this is last index of
		
		
		StringBuilder sb4=new StringBuilder("gaurav");
		sb4.setCharAt(1, 'd');
		System.out.println(sb4); // this is the setCharAt
		
		
		
		

	}

}
