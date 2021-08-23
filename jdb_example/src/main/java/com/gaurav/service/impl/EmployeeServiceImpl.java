package com.gaurav.service.impl;

import com.gaurav.dao.EmployeeDao;
import com.gaurav.daoImpl.EmployeeImpl;
import com.gaurav.model.Employee;
import com.gaurav.service.EmployeeService;

public class EmployeeServiceImpl extends Thread implements EmployeeService  {
	public	EmployeeDao ed=new EmployeeImpl();

	@Override
	public int createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return ed.createEmployee(emp);
	}

	@Override
	public int updateEmployee(int emp_id,double salarly, String designation) {
		// TODO Auto-generated method stub
		return ed.updateEmployee(emp_id,salarly, designation);
	}

	@Override
	public int deleteEmployee(int emp_id) {
		// TODO Auto-generated method stub
		return ed.deleteEmployee(emp_id);
	}


	

}


