package queueusinglinkedlist;

public class QueueLinkedList {
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public Node front, rear, temp;

	public void create(int data) {
		Node newNode = new Node(data);
		if (rear == null) {
			front = newNode;
			rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}

	public void delete() {
		if (front == null) {
			System.out.println("\n queue is empty");
		} else {
			temp = front;
			System.out.println("\n element is deleted " + temp.data);
			front = front.next;
			temp.next = null;
		}
	}

	public void display() {
		temp = front;
		while (temp != null) {
			System.out.println(" " + temp.data);
			temp = temp.next;
		}
	}

}
