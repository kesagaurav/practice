import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>();
		st.add(1);
		st.add(2);
		st.add(3);
		for(int i=0;i<st.size();i++) {
			System.out.println("the  elements in stack is " + st.get(i));
		}
		System.out.println("the first element in stack is " + st.peek());

	}

}
