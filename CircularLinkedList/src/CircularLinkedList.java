
public class CircularLinkedList {
	class Node{
		int data;
		Node next;
		public Node prev;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head;
	private Node tail;
	private Node temp;
	
	
	public void createList(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode;
			tail=newNode;
			tail.next=head;
		}
	}
	
	
	public void insertAtBeg(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
		tail.next=head;
	}
	
	
	public void insertAtEnd(int data) {
		Node newNode=new Node(data);
		tail.next=newNode;
		tail=newNode;
		tail.next=head;
	}
	
	
	public void delAtBeg() {
//		head.next=null;
//		head=head.next;
//		tail.next=head;
		temp=head;
		head=head.next;
		tail.next=head;
		temp.next=null;
	}
	
	
	public void delAtEnd() {
//		tail=temp;
//		tail.prev=tail;
//		tail.next=head;
//		temp.next=null;
		temp=head;
		while(temp.next!=tail) {
			temp=temp.next;
		}
		tail.next=null;
		temp.next=head;
		tail=temp;
	}
	
	
	public void display() {
		temp=head;
		while(temp.next!=head) {
			System.out.printf(" -->  " + temp.data);
			temp=temp.next;
		}
		System.out.printf(" -->  " + temp.data);

	}
	
	
}
