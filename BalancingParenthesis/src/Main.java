import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="([]))";
	//	System.out.println(s.length()-1);
		Stack<Character> s1=new Stack();
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)=='(' && s.charAt(i)=='[') {
				System.out.println(s1.push(s.charAt(i)));
			}else if(s.charAt(i)==')' && s.charAt(i)==']') {
				if(s1.peek()==')' && s1.peek()==']') {
					s1.pop();
				}
			}
		}
		
		if(areBracketsBalanced(s)) {
			System.out.println("balanced");
		}else {
			System.out.println("unbalanced");

		}
		 

	}
	
	static boolean areBracketsBalanced(String expr)
    {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack
            = new ArrayDeque<Character>();
 
        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }
 
            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        // Check Empty Stack
        return (stack.isEmpty());
    }
}
