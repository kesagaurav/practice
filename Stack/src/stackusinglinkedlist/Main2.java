package stackusinglinkedlist;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		//s.push(30);
		System.out.println("\n the elements in the stack are ");
		s.display();
		s.pop();
		System.out.println("\n the elements in the stack are deleted are ");
		s.display();

	}

}
