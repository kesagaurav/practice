package stackusinglinkedlist;

public class Stack {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public Node top;
	public Node temp;

	public void push(int data) {
		Node newNode = new Node(data);
		if (top == null) {
			newNode.data = data;
			newNode.next = null;
			top = newNode;
		} else {
			newNode.data = data;
			newNode.next = top;
			top = newNode;
		}
	}

	public void pop() {
		if (top == null) {
			System.out.println("\n stack is empty");
		} else {
			temp = top;
			int data = top.data;
		//	System.out.println(" " + top.data);
			top = top.next;
			temp.next = null;
		}
	}
	Stack s

	public void display() {
		if (top == null) {
			System.out.println("\n stack is empty");

		}else {
			temp=top;
			while(temp!=null) {
				System.out.println(" " + temp.data);
				temp=temp.next;
			}
		}
	}

}
