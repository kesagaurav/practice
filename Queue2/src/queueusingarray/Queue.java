package queueusingarray;

public class Queue {

	int queue[];
	int front=-1;
	int rear=-1;
	//int size;
	int capacity;
	
	public Queue(int c) {
		capacity=c;
	//	size=0;
		queue=new int[capacity];
	}
	
	public void Enqueue(int data) {
		if(rear==capacity-1) {
			System.out.println("overflow");
		}else {
			if(front==-1) {
				front=0;
			}
			rear++;
			queue[rear]=data;
		}
	}
	
	
	public void dequeue() {
		int ele;
		if(rear==-1) {
			System.out.println("\n undeflow");
		}else {
			ele=queue[front];
			System.out.println(" is deleted " + ele);
			front++;
		}
	}
	
	public void reverse() {
		for(int i=rear;i>=front;i--) {
			System.out.println(queue[i]);
		}
	}
	
	
	public void display() {
		for(int i=front;i<=rear;i++) {
			System.out.println("the elemenst are " + queue[i]);
		}
	}
	
}
