
public class Main {

	public static void main(String[] args) {

		List l1 = new List();

		// l1.insertAtBegginning(4);
		System.out.println("\n insert at begging");
		l1.insertAtBegginning(null, 3);
		l1.display();
		l1.deleteAtBeg(3);
		l1.addNode(5);

		l1.addNode(4);

		l1.addNode(1);
		l1.addNode(2);

		l1.insertAtEnd(12);
		System.out.println("\n the values of linked list are ");
		l1.display();

		System.out.println("\n the reverse of linked list is ");
		l1.printReverse();

		l1.display();

		System.out.println("\n the count of linked list is");
		l1.countOfLinkedList();
		//l1.display();
	}

}
