package com.gaurav.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.gaurav.dao.EmployeeDao;
import com.gaurav.dbutil.MySqlConnection;
import com.gaurav.model.Employee;


public class EmployeeImpl implements EmployeeDao {

	@Override
	public int createEmployee(Employee emp) {
		int c=0;
		try(Connection con=MySqlConnection.getConnection()){
			String sql="insert into employee(name,salarly,designation)values(?,?,?)";
		PreparedStatement preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1, emp.getName());
			preparedStatement.setDouble(2,emp.getSalarly());
			preparedStatement.setString(3,emp.getDesignation());
			c=preparedStatement.executeUpdate();
			System.out.println("\n succesffly inserted " + c);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public int updateEmployee(int emp_id,double salarly, String designation) {
		int d=0;
		try(Connection con=MySqlConnection.getConnection()){
			String sql="update employee set salarly=?,designation=? where emp_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setDouble(1,salarly);
			ps.setString(2,designation);
			ps.setInt(3,emp_id);
			d=ps.executeUpdate();
			System.out.println("\n updated changes successfully" + d);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}

	@Override
	public int deleteEmployee(int emp_id) {
		int e=0;
		try(Connection con=MySqlConnection.getConnection()){
			String sql="delete from employee where emp_id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,emp_id);
			e=ps.executeUpdate();
			System.out.println("\n deleted changes successfully" + e);
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
	}

}
