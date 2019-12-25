package com.zr.five.text;

import java.sql.Connection;

import com.zr.five.utils.MyDBUtils;

public class TextConnection {
  public static void main(String[] args) {
	Connection connection=MyDBUtils.getConnection();
	System.out.println(connection);
}
}
