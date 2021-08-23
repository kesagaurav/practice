package com.gaurav.service.impl;

import com.gaurav.dao.EmployeeDao;
import com.gaurav.daoImpl.EmployeeImpl;


public class EmployeeServiceImpl3 extends Thread {
	public	EmployeeDao ed=new EmployeeImpl();
	public EmployeeServiceImpl serviceImpl;

	public EmployeeServiceImpl3(EmployeeServiceImpl serviceImpl) {
		super();
		this.serviceImpl = serviceImpl;
	}
	
	@Override
	public void run() {
		serviceImpl.getClass();
	}


	
}
