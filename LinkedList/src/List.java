import java.util.LinkedHashSet;

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
	private Node t1;
	private Node t2;

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
	
	public void insertAtSpecifiedPositions(int pos,int data) {
		Node newNode=new Node(data);
		pos=2;
		temp=head;
		for(int i=1;i<pos;i++) {
			temp=temp.next;
			newNode.next=temp.next;
			temp.next=newNode;
		}
	}
	
	
	public void sortOfLinkedList() {
		int t;
		for(t1=head;t1!=null;t1=t1.next) {
			for(t2=head;t2!=null;t2=t2.next) {
				if(t1.data<t2.data) {
					t=t1.data;
					t1.data=t2.data;
					t2.data=t;
				}
			}
		}
	}
	
	
	public void insertSortedElementInLinkedList(int data) {
		int t;
		if(head==null) {
			head=null;
		}
		for(t1=head;t1!=null;t1=t1.next) {
			for(t2=head;t2!=null;t2=t2.next) {
				if(data<t1.data) {
					t=t1.data;
					t1.data=data;
					data=t;
				}
			}
		}
	}
	
	
	public void removeDuplicates() {
		LinkedHashSet<Node> set=new LinkedHashSet<>();
		for(t1=head;t1!=null;t1=t1.next) {
			set.add(t1);
		}
		System.out.println("\n removed slements are " + set);
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
