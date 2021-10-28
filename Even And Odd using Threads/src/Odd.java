
public class Odd extends Thread {
	int number=1;
	int MAX=5;
	public void isOdd() {
		synchronized (this) {
			while(number<MAX) {
				while(number%2!=0) {
					try {
						wait();
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		System.out.println(number + "odd thread");
		number++;
		notify();
	}
	
}
