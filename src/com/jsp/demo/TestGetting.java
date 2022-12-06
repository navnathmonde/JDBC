package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestGetting {
public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		
		String sql = "SELECT * FROM product";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//To establish Connection
			 Connection connection1 = DriverManager.getConnection(url, username, password);
			 
			 //CREATE STATEMENT
			 Statement statement = connection1.createStatement();
			 //execute the statement
			 ResultSet resultset = statement.executeQuery(sql);
			 
			;
			while(resultset.next()) {
				System.out.println("==============");
				System.out.println(resultset.getInt(1));
				System.out.println(resultset.getString(2));
				System.out.println(resultset.getString(3));
			}
			connection1.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}

}

