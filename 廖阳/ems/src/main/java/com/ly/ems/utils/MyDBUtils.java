package com.ly.ems.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyDBUtils {

	private static String driver;
	private static String url;
	private static String username;
	private static String password;

	// 用于存储db.properties文件中
	private static Properties properties = new Properties();

	private MyDBUtils() {
	}

	static {
		try {
			InputStream iStreamReader = Thread.currentThread().getContextClassLoader()
					.getResourceAsStream("db.properties");

			properties.load(iStreamReader);

			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			username = properties.getProperty("username");
			password = properties.getProperty("password");

			Class.forName(driver);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		Connection connection = DriverManager.getConnection(url, username, password);
		return connection;
	}
}
