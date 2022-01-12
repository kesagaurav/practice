
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList cl=new CircularLinkedList();
		cl.createList(10);
		cl.createList(20);
		cl.createList(30);
		cl.createList(40);
		cl.display();
		System.out.println("\n insert the value at begging and the end");
		cl.insertAtBeg(5);
		//cl.insertAtBeg(15);
		cl.insertAtEnd(50);
		cl.insertAtEnd(60);
		cl.display();
		System.out.println("\n delete the value at begining");
		cl.delAtBeg();
		cl.display();
		System.out.println("\n delete the value at the end");
		cl.delAtEnd();
		cl.display();

	}

}
