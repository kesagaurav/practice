
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
	private Node current;
	private Node prev=null;
	private Node next2;
	

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

	public Node insertAtBegginning(Node newNode,int data) {
		newNode = new Node(data);
		newNode.data = data;
		newNode.next = head;
		return head = newNode;

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
	
	public void printReverse() {
		current=head;
		while(current!=null) {
			next2=current.next;
			current.next=prev;
			prev=current;
			current=next2;
		}
		head=prev;
			
			
	}
	
	public void countOfLinkedList() {
		temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		System.out.println("\n the count of linked list is " + count);
	}

}
