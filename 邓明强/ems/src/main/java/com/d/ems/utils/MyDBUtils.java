package com.d.ems.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class MyDBUtils {
    
	public static String driver;
	public static String url;
	public static String username;
	public static String password;
	
	private static Properties properties = new Properties();
	/**私有构造*/
	private MyDBUtils() {}
	
	static {
		try {
			
		
		//首先读取properties文件
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
		
		//把读取到的文件的数据加入properties集合中
		properties.load(is);
		
		//把读取的数据赋值到程序中
		driver = properties.getProperty("driver");
		url = properties.getProperty("url");
		username = properties.getProperty("username");
		password = properties.getProperty("password");
		//注册驱动
		Class.forName(driver);
		
	}catch (IOException e){
		e.printStackTrace();
	}catch (ClassNotFoundException e){
		e.printStackTrace();
	}
	}
	/**
	 * 调用该方法就获取到数据库的连接对象
	 * @return
	 */
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return connection;
	}

}

