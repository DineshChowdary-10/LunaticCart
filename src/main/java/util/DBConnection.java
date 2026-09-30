package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import model.Product;

public class DBConnection {
	private static final String url = "jdbc:mysql://localhost:3306/lunaticcart";
	private static final String user = "root";
	private static final String password = "Dinesh@10630";
	
	public static Connection getConnection() throws SQLException
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return DriverManager.getConnection(url, user, password);
	}
	
	
}
