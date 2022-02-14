import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String infix="a-(b*c-d)/e";
		System.out.println(infixToPostfix(infix));
		
	}
	
	public static String infixToPostfix(String infix) {
		String postfix="";
		Stack<Character> schar=new Stack<>();
	
		for(int i=0;i<infix.length();i++) {
			char ch=infix.charAt(i);
			if(Character.isAlphabetic(i)) {
				postfix+=ch;
			}else if(ch=='(') {
				schar.push(ch);
			}else if(ch==')') {
				if(!schar.isEmpty() && schar.peek()!='(') {
					postfix+=schar.pop();
					schar.pop();
				}
			}
			else  {
				while(!schar.isEmpty() && prec(ch)<=prec(schar.peek())) {
					schar.pop();
					postfix+=schar.pop();
				}
				schar.push(ch);
			}
			while(!schar.isEmpty()) {
				if(schar.peek()=='(')
					postfix+=schar.pop();
			}
			return postfix;
			
		}
		return postfix;
		
		}
	
	
	
	
	
	
	
	
	
	static int prec(char ch) {
		switch(ch) {
		case  '+': 
		case  '-':
			return 1;
		case  '*':
		case  '/':
		return 2;
		case '^':
			return 3;
			
		}
		return -1;
	}

}
