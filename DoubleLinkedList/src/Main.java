
public class Main {

	public static void main(String[] args) {

		DoubleLinkedList dl = new DoubleLinkedList();
		dl.createList(10);
		dl.createList(20);
		dl.createList(30);
		dl.display();
		System.out.println("\n insert the value at beginning and the end");
		dl.insertAtBeg(5);
		dl.insertAtBeg(4);
		dl.insertAtEnd(40);
		dl.display();
		System.out.println("\n delete the value at beginning");
		dl.delAtBeg(4);
		dl.display();
		System.out.println("\n delete the value at the last");
		dl.deleteAtEnd(40);
		dl.display();
		System.out.println("\n count the ddl");
		dl.count();
		System.out.println("\n serach the linked list");
		dl.searchOfList(10);
		System.out.println("\n reverse of double linked list");
		dl.reverse();

	}

}
