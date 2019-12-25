package com.zr.ems.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyDBUtils {
public  static String driver;
private static String url;
private static String username;
private static String password;

private static Properties properties =new Properties();

private MyDBUtils() {}

	static {
		try {
		InputStream is =Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
		
		properties.load(is);
		
		driver=properties.getProperty("driver");
		url=properties.getProperty("url");
		username=properties.getProperty("username");
		password=properties.getProperty("password");
		
		Class.forName(driver);
	  } catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	}

	public static Connection getConnection() {
		
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		return connection;
	}
}
