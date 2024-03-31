package jdbcprogram;
import java.sql.*;
import java.util.*;

public class CallableStatementInterface {
	public static void main(String args[])throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/collegedetails","root","Spriya@2001");
		CallableStatement callablestatement=connection.prepareCall("{call sp(?,?,?)}");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		int a =sc.nextInt();
		System.out.println("Enter Employee Name");
		String b =sc.next();
		System.out.println("Enter Employee Stream");
		String c =sc.next();
		callablestatement.setInt(1, a);
		callablestatement.setString(2, b);
		callablestatement.setString(3, c);
		callablestatement.execute();
		callablestatement.close();
		connection.close();
		
	}

}
