package com.main;

import com.consumer.Consumer;
import com.producer.Producer;
import com.shop.Shop;

public class Main {

	public static void main(String[] args) {
		
		Shop obj=new Shop();
		Producer p=new Producer(obj);
		Consumer c=new Consumer(obj);
		
	}

}
