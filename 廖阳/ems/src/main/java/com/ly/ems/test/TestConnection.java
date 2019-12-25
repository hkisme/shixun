package com.ly.ems.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.ly.ems.utils.MyDBUtils;

public class TestConnection {

	public static void main(String[] ages) throws SQLException {
		Connection connection = MyDBUtils.getConnection();
		System.out.println(connection);
	}
}
