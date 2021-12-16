package com.evenodd;

public class EvenOdd {

	int n;
	boolean even = false;

	public void getEven() {
		int i = 1;
		synchronized (this) {
			try {
				for (i = 1; i <= 5; i++) {
					if (i % 2 == 0 && even == true) {
						wait();

					}
				}

			} catch (InterruptedException e) {
				System.out.println("\n error " + e);
			}
			n = i;
			System.out.println("\n even  " + i);
			even = true;
			notify();
		}
	}

	public synchronized void getOdd() {
		int i = 1;
		synchronized (this) {

			try {
				for (i = 1; i <= 5; i++) {
					if (i % 2 != 0 && even == true) {
						wait();

					}
				}
			} catch (InterruptedException e) {
				System.out.println("\n error " + e);
			}

			System.out.println("\n odd  " + n);
			even = false;
			notify();
		}
	}

}
