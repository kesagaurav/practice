
public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Even e = new Even();
		Odd odd = new Odd();
		Thread even = new Thread(new Runnable() {

			@Override
			public void run() {
				e.isEven();

			}

		});

		even.start();

		Thread odd1 = new Thread(new Runnable() {

			@Override
			public void run() {
				odd.isOdd();
			}

		});

		odd1.start();
		
		even.join();
		odd1.join();

	}

}
