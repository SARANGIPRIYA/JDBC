package jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementInterface {
public static void main(String args[]) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/collegedetails","root","Spriya@2001");
	Statement statement=connection.createStatement();
	
	//for creating a table in databse.query
//	statement.executeUpdate("Create Table Employee(empId int,name varchar(25),stream varchar(20))");
//	System.out.println("Table created Successfully!!");
	
	//Inserting values into db query
//	int i=statement.executeUpdate("Insert into Employee Values(4,'abc','EEE')");
//	System.out.println("Employee Inserted Succesfully"+ " "+ i);
	
	//Updating the value in database query.
//	 int i=statement.executeUpdate("update Employee set empId=7 where stream='IT'");
//	 System.out.println("Records Updated Successfully!!" + " "+i);
 
	//Deleting the record from database with query.
//	int i=statement.executeUpdate("Delete from Employee where empId=10");
//	System.out.println("Record Deleted Successfully!!"+ " "+ i);
	
	
	//Select or retrieve Query to fetch data from database.
	ResultSet resultset=statement.executeQuery("Select * from Employee");
	while(resultset.next()) {
		System.out.println("empId="+resultset.getInt(1));
		System.out.println("name="+resultset.getString(2));
		System.out.println("stream="+resultset.getString(3));
	}
	
}
}
