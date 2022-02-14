package queueusinglinkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinkedList qll=new QueueLinkedList();
		qll.create(5);
		qll.create(10);
		qll.create(20);
		qll.create(30);
		qll.create(40);
		qll.delete();
		System.out.println("\n dleteing an element from the queue");
		qll.display();
//		System.out.println("displaying the elemensts are ");
//		qll.display();

	}

}
