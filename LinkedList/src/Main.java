
public class Main {

	public static void main(String[] args) {

		List l1 = new List();

		// l1.insertAtBegginning(4);
		System.out.println("\n insert at begging");
		l1.insertAtBegginning(3);
		l1.display();
		l1.deleteAtBeg(3);
		l1.addNode(5);

		l1.addNode(4);

		l1.addNode(1);
		l1.addNode(2);
		l1.addNode(10);
		l1.addNode(20);
		l1.addNode(30);

		l1.insertAtEnd(12);
		System.out.println("\n the values of linked list are ");
		l1.display();

		System.out.println("\n the reverse of linked list is ");
		l1.printReverse();

		l1.display();

		//System.out.println("\n the count of linked list is");
		l1.countOfLinkedList();
		//l1.display();
		System.out.println("\n inserting at specified positions");
		l1.insertAtSpecifiedPositions(5, 50);
		l1.display();
		System.out.println("\n after sorting the elements");
		l1.sortOfLinkedList();
		System.out.println("\n inserting the sorting elements");
		l1.insertSortedElementInLinkedList(25);
		l1.display();
		
	}

}
