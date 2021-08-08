package StringBuffer;

public class StringBufferMain {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("hello");
		System.out.println("contents of sb:" +sb+ " memory of sb1:" + System.identityHashCode(sb));
		sb.append("hey").append(123).append(12.33).append(true);
		System.out.println(sb);
		
		sb.delete(0, 2);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.deleteCharAt(2);
		System.out.println(sb);
		
		sb.insert(1, " i am new word here");
		System.out.println(sb);
		System.out.println(sb.length());
		
		StringBuffer sb2=new StringBuffer("hello");  
		StringBuffer sb3=new StringBuffer("hello");
		if(sb2.equals(sb3)) {
			System.out.println("\n equal");
		}else {
			System.out.println("\n not equal");
		}

	}

}
