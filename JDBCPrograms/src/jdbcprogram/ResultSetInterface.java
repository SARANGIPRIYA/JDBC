package jdbcprogram;
import java.sql.*;

public class ResultSetInterface {
	public static void main(String args[])throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/collegedetails\",\"root\",\"Spriya@2001");
		Statement statement=connection.createStatement();
		//create statement
		//insert values
		//ResulSet interface is used with selct query these are the steps used.
		//same like preparedstatement and statement example
		ResultSet resultset=statement.executeQuery("Select * from Employee");
		while(resultset.next()) {
			System.out.println("empId="+resultset.getInt(1));
			System.out.println("name="+resultset.getString(2));
			System.out.println("stream="+resultset.getString(3));
		}
		
		
	}

}
