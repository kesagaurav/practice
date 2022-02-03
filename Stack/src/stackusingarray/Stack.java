package stackusingarray;

public class Stack {

	int a[];
	int cap;
	int top = -1;
	
	public Stack(int c) {
		
		cap = c;
		a = new int[c];

	}

	public void push(int data) {
		if(top==cap-1) {
			System.out.println("overflow");
		}else {
			top++;
			a[top]=data;
		}
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println("underflow");
		}else {
			int data=a[top];
			top--;
		}
	
	}
	
	public void display() {
		if(top!=-1) {
			for(int i=top;i>=0;i--) {
				System.out.println(" " + a[i]);
			}
		}else {
			System.out.println("empty stack");
		}
	}

}
