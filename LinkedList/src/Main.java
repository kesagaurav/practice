
public class Main {

	public static void main(String[] args) {

		List l1 = new List();

		// l1.insertAtBegginning(4);

		l1.insertAtBegginning(3);
		
		l1.deleteAtBeg(3);
		l1.addNode(5);

		l1.addNode(4);

		l1.addNode(1);
		l1.addNode(2);

		l1.insertAtEnd(12);

		l1.display();
	}

}
