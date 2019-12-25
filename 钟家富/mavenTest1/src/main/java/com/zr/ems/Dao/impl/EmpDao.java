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

		// 1, ��ȡ���������ݿ�Ķ���
		Connection connection = MyDBUtils.getConnection();

		try {

			// 2, ��ȡ��ִ��sql����Ԥ�������
			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			// 3, ��sql�е�ռλ��[?] ��ֵ
			prepareStatement.setString(1, nickname);
			prepareStatement.setString(2, password);

			// 4, ִ��sql���, �õ������
			ResultSet resultSet = prepareStatement.executeQuery();

			// 5, �����ֵ, ���װ, Ȼ��, ����
			while (resultSet.next()) {
				// ��ȡ���ݿ��ж�Ӧ������ֵ
				int id = resultSet.getInt("id");
				String gender = resultSet.getString("gender");
				double salary = resultSet.getDouble("salary");

				// �����ݸ�ײ��������
				Emp emp = new Emp(id, nickname, password, gender, salary);

				return emp;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// �Ͽ�����, �ͷ���Դ
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	public int findEmpByNickname(String nickname1) {
		String sql = "select * from emp where nickname=? ";

		// 1, ��ȡ���������ݿ�Ķ���
		Connection connection = MyDBUtils.getConnection();

		try {

			// 2, ��ȡ��ִ��sql����Ԥ�������
			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			// 3, ��sql�е�ռλ��[?] ��ֵ
			prepareStatement.setString(1, nickname1);
		
			// 4, ִ��sql���, �õ������
			ResultSet resultSet = prepareStatement.executeQuery();

			// 5, �����ֵ, ���װ, Ȼ��, ����
			while (resultSet.next()) {

				return 1;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// �Ͽ�����, �ͷ���Դ
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return 0;
	}

	public void zhuce(Emp emp) {
		// TODO �Զ����ɵķ������
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
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		

	}

}

