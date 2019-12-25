package com.zr.ems.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zr.ems.dao.IEmpDao;
import com.zr.ems.pojo.Emp;
import com.zr.ems.utils.MyDBUtils;

/**
 * �־ò��ʵ����
 *
 */
public class EmpDao implements IEmpDao {

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

	public int findEmpByNickname(String nickname) {

		String sql = "select * from emp where nickname=?";

		// 1, ��ȡ���������ݿ�Ķ���
		Connection connection = MyDBUtils.getConnection();

		try {

			// 2, ��ȡ��ִ��sql����Ԥ�������
			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			// 3, ��sql�е�ռλ��[?] ��ֵ
			prepareStatement.setString(1, nickname);

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

	public void registerEmp(Emp emp) {
		String sql = "insert into emp values(null, ?, ?, ?, ?)";

		Connection connection = MyDBUtils.getConnection();

		try {
			// ��ȡ��ִ��sql�Ķ���
			PreparedStatement prepareStatement = connection.prepareStatement(sql);

			// ��ռλ����ֵ
			prepareStatement.setString(1, emp.getNickname());
			prepareStatement.setString(2, emp.getPassword());
			prepareStatement.setString(3, emp.getGender());
			prepareStatement.setDouble(4, emp.getSalary());

			// ִ�� ��, ɾ, ��, ����ʹ��executeUpdate()����
			prepareStatement.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
