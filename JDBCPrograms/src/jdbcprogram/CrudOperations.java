package jdbcprogram;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class CrudOperations {
	
	public static void main(String args[]) throws Exception  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/collegedetails","root","Spriya@2001");
		Statement statement=connection.createStatement();
		
		
		////FOR CREATE QUERY 
//		statement.executeUpdate("Create  Table student(rno int,name varchar(25),branch varchar(10))");
//		System.out.println("student table created");
		
		
		////FOR INSERTEING VALUES IN TABLE
	int i=statement.executeUpdate("Insert into  student Values(4,'priya','CSE')");
//		
//		 i=statement.executeUpdate("Insert into  student Values(2,'Hanumath','ITI')");
//		
//		int i=statement.executeUpdate("Insert into  student Values(3,'abc','EEE')");
	System.out.println(" Record Inserted Successfully"+" " +i);
		
		//SELECT QUERY  //ResulSet is a interface through which we can achieve this.
//		ResultSet resultset=statement.executeQuery("Select * from student");   //to retrirve all records from table.
//		while(resultset.next()) {
//			System.out.println("rno="+resultset.getInt(1));      
//			System.out.println("name="+resultset.getString(2));
//			System.out.println("branch="+resultset.getString(3));
//	}
//		resultset.close();
		
		
		
		//UPDATE QUERY to update records in db.
//		int i =statement.executeUpdate("update student set rno=5 where branch='ITI'");
//		System.out.println(i +" "+"records updated Succesfully");
		
		//DELETE QUERY to delete records from db.
//		int i=statement.executeUpdate("delete from student where branch='CSE'");
//		System.out.println(i + " "+"Records deleted Successfully");
		statement.close();
		connection.close();
	}
	}


