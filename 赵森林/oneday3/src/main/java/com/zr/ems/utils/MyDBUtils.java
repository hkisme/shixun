package com.zr.ems.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.xdevapi.DbDoc;

/**
 * 连接数据库工具类
 * 
 * @author 木木
 *
 */
public class MyDBUtils {

	public static String driver;
	private static String url;
	private static String username;
	private static String password;

	/**
	 * 用于储存db.properties文件中数据的集合
	 */
	private static Properties properties = new Properties();

	/**
	 * 单例模式，私有构造函数
	 */
	private MyDBUtils() {
	}

	static {
		try {
			// 首先读取db.properties文件
			InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");

			// 把从db.properties中读取的数据加入到Properties集合中
			properties.load(is);

			// 把读取到的数据赋值程序
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			username = properties.getProperty("username");
			password = properties.getProperty("password");

			// 注册驱动
			Class.forName(driver);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 调用方法返回数据库连接对象
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
