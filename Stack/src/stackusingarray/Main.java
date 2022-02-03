package stackusingarray;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack(3);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);  //it will give overflow because i added the capacity beyond the stack
		s.display();
		System.out.println("\n after popping the element");
		s.pop();
		s.display();

	}

}
