package com.zr.ems.Dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zr.ems.Dao.IEmpDao;
import com.zr.ems.pojo.Emp;
import com.zr.ems.utils.MyDBUtils;

public class EmpDao implements IEmpDao {
	@Override
	public Emp findEmpByNicknameAndPassword(String nickname, String password) {
		
		String sql = "select * from emp where nickname=? and password=?";

		// 1, 获取到链接数据库的对象
		Connection connection = MyDBUtils.getConnection();

		try {

			// 2, 获取到执行sql语句的预编译对象
			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			// 3, 给sql中的占位符[?] 赋值
			prepareStatement.setString(1, nickname);
			prepareStatement.setString(2, password);

			// 4, 执行sql语句, 得到结果集
			ResultSet resultSet = prepareStatement.executeQuery();

			// 5, 如果有值, 则封装, 然后, 返回
			while (resultSet.next()) {
				// 获取数据库中对应的数据值
				int id = resultSet.getInt("id");
				String gender = resultSet.getString("gender");
				double salary = resultSet.getDouble("salary");

				// 把数据更撞到对象中
				Emp emp = new Emp(id, nickname, password, gender, salary);

				return emp;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 断开链接, 释放资源
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	public int findEmpByNickname(String nickname1) {
		String sql = "select * from emp where nickname=? ";

		// 1, 获取到链接数据库的对象
		Connection connection = MyDBUtils.getConnection();

		try {

			// 2, 获取到执行sql语句的预编译对象
			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			// 3, 给sql中的占位符[?] 赋值
			prepareStatement.setString(1, nickname1);
		
			// 4, 执行sql语句, 得到结果集
			ResultSet resultSet = prepareStatement.executeQuery();

			// 5, 如果有值, 则封装, 然后, 返回
			while (resultSet.next()) {

				return 1;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 断开链接, 释放资源
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return 0;
	}

	public void zhuce(Emp emp) {
		// TODO 自动生成的方法存根
		String sql = "insert into emp values(null,?,?,?,?)";
		Connection connection=MyDBUtils.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,emp.getNickname());
			preparedStatement.setString(2, emp.getPassword());
			preparedStatement.setString(3, emp.getGender());
			preparedStatement.setDouble(4, emp.getSalary());
			
		    preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		

	}

}

