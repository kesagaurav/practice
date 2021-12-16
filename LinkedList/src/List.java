
public class List {

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	private Node head;
	private Node tail;
	private Node temp;

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}

	}

	public void insertAtBegginning(int data) {
		Node newNode = new Node(data);
		newNode.data = data;
		newNode.next = head;
		head = newNode;

	}
	
	public void insertAtEnd(int data) {
		Node newNode=new Node(data);
		newNode.data=data;
		tail.next=newNode;
		newNode.next=null;
		tail=newNode;
	}
	
	
	public void deleteAtBeg(int data) {
		head.next=null;
		head=head.next;
	}
	

	public void display() {
		temp = head;
		while (temp != null) {
			System.out.printf(" " + temp.data);
			temp = temp.next;

		}
	}

}
