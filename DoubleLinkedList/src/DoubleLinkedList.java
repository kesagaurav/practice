
public class DoubleLinkedList {
	class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}

	}

	private Node head;
	private Node tail;
	private Node temp;
	private Node t, curr,prev=null;

	public void createList(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {

			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}

	}

	public void insertAtBeg(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head.prev = newNode;
		head = newNode;

	}

	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		tail.next = newNode;
		newNode.prev = tail;
		newNode.next = null;

		tail = newNode;

	}

	public void delAtBeg(int data) {
		temp = head;
		head = head.next;
		temp.next = null;
		head.prev = null;

	}

	public void deleteAtEnd(int data) {
		temp = tail;
		temp = temp.prev;
		temp.next = null;
		tail.prev = null;
	}

	public void count() {
		int count = 0;
		temp = head;
		while (temp != null) {
			System.out.println(" " + temp.data);
			count++;
			temp = temp.next;
		}
		System.out.println("\n the value of count is " + count);
	}

	public void searchOfList(int data) {
		int key = 0;

		// temp = head;
		for (t = head; t != null; t = t.next) {
			if (data == t.data) {
				System.out.println("\n number is found " + t.data);
				key++;
			}
		}
		if (key == 0) {
			System.out.println("\n nothing is found ");
		}
		// while(temp!=null) {
//		if (temp.data == data) {
//				System.out.println("\n the value is found " + temp.data);
//			break;
//
//		} else  {
//			key++;
//			temp = temp.next;
//			
//		}
//		
//	}

	}

	public void display() {
		temp = head;
		while (temp != null) {
			System.out.printf(" --> " + temp.data);
			temp = temp.next;
		}
	}

	public Node reverse() {
		curr = head;
		//Node prev = null;
		while (curr != null) {
			prev = curr.prev;
			curr.prev = curr.next;
			curr.next = prev;
			curr = curr.prev;
		}
		return prev.prev;
//head=prev;
	}

}
