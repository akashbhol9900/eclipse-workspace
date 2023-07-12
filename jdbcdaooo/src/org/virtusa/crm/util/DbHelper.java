package org.virtusa.crm.util;
import java.io.FileInputStream;
import java.net.PasswordAuthentication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
public class DbHelper {
	public static Connection getConnection() {
		Properties properties=getProperties("C:\\Users\\ravindra\\eclipse-workspace\\Jdbc1\\src\\org\\virtusa\\crm\\util\\db.properties");
		String driver=properties.getProperty("db.driver");
		String url=properties.getProperty("db.url");
		String username=properties.getProperty("db.username");
		String password=properties.getProperty("db.password");
		Connection con=getConn(driver,url,username,password);
		return con;
	}
	
	
	private static Connection getConn(String driver,String url, String username,String pwd) {
		Connection connection=null;
		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url,username,pwd);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
		
	}
	private static Properties getProperties(String fileName) {
		Properties properties=null;
		try {
			FileInputStream fis=new FileInputStream(fileName);
			properties=new Properties();
			properties.load(fis);

			}catch (Exception e) {
				e.printStackTrace();
			}
		return properties;
	}
	

}
