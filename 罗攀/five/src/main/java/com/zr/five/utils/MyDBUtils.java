package com.zr.five.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



/**
 * 
 * 连接数据库
 *
 */
public class MyDBUtils {
	public static String driver;
	public static String url;
	public static String username;
	public static String password;
	
	private static Properties properties =new Properties();
	/**
	 * 私有构造方法
	 */
	
	
    private MyDBUtils() {
   }
    
    
    static {
    	try {
    	InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
    	
    	properties.load(is);
    	
    	driver=properties.getProperty("driver");
    	url=properties.getProperty("url");
    	username=properties.getProperty("username");
    	password=properties.getProperty("password");
    	
    	Class.forName(driver);
    }catch (IOException e){
    	e.printStackTrace();
    	
    }catch (ClassNotFoundException e) {
    	e.printStackTrace();
    }
    }
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection=DriverManager.getConnection(url,username,password);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}

