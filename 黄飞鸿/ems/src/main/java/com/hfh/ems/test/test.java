package com.hfh.ems.test;

import java.sql.Connection;

import com.hfh.ems.utils.MYDBUtils;

public class test {

	public static void main(String[] args) {
		
		Connection connection = MYDBUtils.getConnection();
		System.out.println(connection);
	}
	
}
