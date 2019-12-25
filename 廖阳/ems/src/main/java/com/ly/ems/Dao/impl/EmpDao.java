package com.ly.ems.Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ly.ems.Dao.IEmpDao;
import com.ly.ems.pojo.Emp;
import com.ly.ems.utils.MyDBUtils;
import com.mysql.cj.PerConnectionLRUFactory;
import com.mysql.cj.jdbc.MysqlSQLXML;

public class EmpDao implements IEmpDao {

	public Emp findEmpByUserNameAndPassWord(String username, String password) {
		// TODO Auto-generated method stub
		String sql = "select * from emp where nickname=? and password=?";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = MyDBUtils.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String gender = resultSet.getString("gender");
				double salary = resultSet.getDouble("salary");
				Emp emp = new Emp(id, username, password, gender, salary);
				return emp;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		return null;
	}

	public int findEmpByUserName(String username) {
		// TODO Auto-generated method stub
		String sql = "select * from emp where nickname=?";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = MyDBUtils.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, username);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				return 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		return 0;
	}

	public void addEmpByAll(Emp emp) {
		// TODO Auto-generated method stub
		String sql = "insert into emp values(null,?,?,?,?)";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = MyDBUtils.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, emp.getUsername());
			preparedStatement.setString(2, emp.getPassword());
			preparedStatement.setString(3, emp.getGender());
			preparedStatement.setDouble(4, emp.getSalary());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
