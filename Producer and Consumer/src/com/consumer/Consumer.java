package com.consumer;

import com.shop.Shop;

public class Consumer implements Runnable {

	Thread t;
	Shop sh;

	public Consumer(Shop sh) {
		this.sh = sh;
		t = new Thread(this, "Consumer");
		t.start();

	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				sh.get();
				Thread.sleep(50);
//				sh.get();

			}
		} catch (InterruptedException e) {
			System.out.println("\n error " + e);
		}

	}

}
