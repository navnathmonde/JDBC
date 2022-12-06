package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletePro {
public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="root";
		
		String sql = "DELETE FROM product Where ID=7";
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//To establish Connection
			 connection= DriverManager.getConnection(url,username,password);
			 //CREATE STATEMENT
			 Statement statement = connection.createStatement();
			 //execute the statement
			int a =statement.executeUpdate(sql);
			if(a>0) {
				System.out.println("Delete Data");
			}else {
				System.out.println("Not Delete");
			}
			 System.out.println("All good");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//close the connection
			connection.close();
		}
		
	}


}
