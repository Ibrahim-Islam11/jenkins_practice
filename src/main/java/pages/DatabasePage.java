package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	Connection connection;
	Statement statement;
	ResultSet resultSet;
	String columnValue;
	
	public String getDataFromDatabase(String columnValue) {
		
		// Set properties for MySQL:
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// "jdbc:mysql:// + hostName + portNumber/ + databaseName"
			String sqlUrl = "jdbc:mysql://44.195.13.80:3306/august_2023";
			String sqlUsername = "student";
			String sqlPassword = "Student@123";
			String sqlQuery = "SELECT * FROM login_data;";
			// Create connection to the database:
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
			// Empower connection reference variable to execute queries:
			statement = connection.createStatement();
			//Execute queries:
			resultSet = statement.executeQuery(sqlQuery);
			
			while(resultSet.next()) {
				columnValue = resultSet.getString(columnValue);
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		return columnValue;
	}

}
