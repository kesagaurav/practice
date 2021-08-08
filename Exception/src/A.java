
public class A extends Thread {

	synchronized void add() {
		int a=20;
		int b=30;
		int c=a+b;
	
		try {
			wait();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(c);
	}
	
	
	synchronized void cal() {
		int c = 0;
		notify();
		System.out.println(c);
	}
	
	
}
