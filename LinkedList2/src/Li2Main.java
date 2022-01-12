
public class Li2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List2 li = new List2();

		li.createList(10);
		li.createList(20);
		li.createList(30);
		li.display();
		System.out.println("\n inserting the value at begining");
		li.insertAtBeg(40);
		li.insertAtBeg(50);

		li.display();

		li.delAtBeg(50);
		li.display();
		System.out.println("\n delete the values at beginning");

	}

}
