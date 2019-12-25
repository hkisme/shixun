package com.d.ems.test;

import java.sql.Connection;

import com.d.ems.utils.MyDBUtils;

public class TestConnection {

	public static void main(String[] args) { 
		
		Connection connection = MyDBUtils.getConnection();
		System.out.println(connection);
	}
}
