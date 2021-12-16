package com.producer;

import com.shop.Shop;

public class Producer implements Runnable {
	Thread t;
	Shop sh;

	public Producer(Shop sh) {
		this.sh = sh;
		t = new Thread(this, "Producer");
		t.start();

	}

	@Override
	public void run() {

		try {
			for (int i = 1; i <= 5; i++) {
				Thread.sleep(200);
				sh.put(i);

			}
		} catch (InterruptedException e) {
			System.out.println("error " + e);
		}
	}

}
