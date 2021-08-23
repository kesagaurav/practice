package com.gaurav.service;

import com.gaurav.model.Employee;

public interface EmployeeService {
	public int createEmployee(Employee emp);
	public int updateEmployee(int emp_id,double salarly,String designation);
	public int deleteEmployee(int emp_id);
}
