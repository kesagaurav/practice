package com.main;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.evenodd.EvenOdd;


public class Main {

	public static void main(String[] args) {
		EvenOdd eodd=new EvenOdd();
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				eodd.getEven();
			}
		});
		
		
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				eodd.getOdd();
			}
		});
		
		t.start();
		t2.start();
		
		
		List<Integer> li=new LinkedList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		
		
		List<Integer> li2=new ArrayList<>();
		li2.add(1);
		li2.add(2);
		li2.add(3);
		li2.add(4);
		
	}
}
