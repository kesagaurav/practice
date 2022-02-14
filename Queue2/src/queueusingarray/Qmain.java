package queueusingarray;

public class Qmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(5);
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		// q.Enqueue(60); it will give rise to overflow condition

		q.dequeue();

		System.out.println("\n deleteing the element in the queue");
		q.display();
		System.out.println("\n display the elements of queue are ");
		q.display();
		System.out.println("after reversing the elements");

		q.reverse();
		// q.display();

	}

}
