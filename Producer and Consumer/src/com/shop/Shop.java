package com.shop;

public class Shop {

	int pno;
	boolean flag = false;

	public synchronized void put(int n) {
		try {
			if (flag == true) {
				wait();
			}
		} catch (InterruptedException e) {
			System.out.println("error " + e);
		}
		pno = n;
		System.out.println("producer " + pno);
		flag = true;
		notify();
	}

	public synchronized void get() {
		try {
			if (flag == false) {
				wait();

			}
		} catch (InterruptedException e) {
			System.out.println("error " + e);
		}
		System.out.println("consumed " + pno);
		flag = false;
		notify();
	}

}
