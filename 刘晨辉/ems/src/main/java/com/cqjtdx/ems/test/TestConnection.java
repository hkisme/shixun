package com.cqjtdx.ems.test;

import java.sql.Connection;

import com.cqjtdx.ems.utils.MyDBUtils;

public class TestConnection {
	public static void main(String[] args) {

		Connection connection= MyDBUtils.getConnection();
		System.out.println(connection);
	}
}
