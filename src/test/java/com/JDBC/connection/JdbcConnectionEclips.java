package com.JDBC.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JdbcConnectionEclips {

	public static void main(String[] args) throws SQLException {

		//Create the connection....
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","Sanskriti$*123");
		
		//Create the Statement or query...
		Statement stm = con.createStatement();
	//	 String s = "INSERT INTO STUDENTS VALUES(9,'Swathi','Electronics',34,'singing')";
	//	  String s = "UPDATE STUDENTS SET NAME='GOPIKA' WHERE AGE=25";
	//	String s = "DELETE FROM STUDENTS  WHERE NAME='GOPIKA'";
		
		String s ="SELECT * FROM STUDENTS";
		//Execute Statement/query AND store data in the resultset
		// stm.execute(s); // EXECUTE METHOD USED FOR ONLY INSET,DELETE AND UPDATE
		
		ResultSet rs = stm.executeQuery(s); // for getting the result and store the data
		while(rs.next()) {
			int id = rs.getInt("ID");
			String name = rs.getString("NAME");
			String subject = rs.getString("SUBJECT");
			int age = rs.getInt("AGE");
			String hobby = rs.getString("HOBBY");
			
			
			System.out.println(id +"  " +name +"  " +subject + "  " +age + "  " +hobby);
			
			
					
			
		}
		
		
	
	
		
		 //Close the connection
		 con.close();
		 System.out.println("Query excecuted");
	}

}
