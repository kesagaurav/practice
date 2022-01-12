
public class List2 {

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

	public void createList(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}

	}

	public void display() {
		temp = head;
		while (temp != null) {
			System.out.printf("   -->   " + temp.data);
			temp = temp.next;
		}
	}

	public void insertAtBeg(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void delAtBeg(int data) {

		head.next = null;
		head = head.next;

	}

}
