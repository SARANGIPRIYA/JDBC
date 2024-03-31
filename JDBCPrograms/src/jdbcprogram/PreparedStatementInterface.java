package jdbcprogram;
import java.sql.*;
import java.util.*;
public class PreparedStatementInterface {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/collegedetails","root","Spriya@2001");
		//Creating a table using preparedstatement in database
	PreparedStatement preparedstatement=connection.prepareStatement("Create Table FavChoclate(chocId int,name varchar(30),company varchar(25))");
//		preparedstatement.executeUpdate();
//		System.out.println("FavChoclate Table Created Successfully!!");
		
		     //Inserting the values in db
//		PreparedStatement preparedstatement=connection.prepareStatement("INSERT INTO FavChoclate (chocId, name, company) VALUES (?, ?, ?)");
//		Scanner sc= new Scanner(System.in);
//		while(true) {
//			System.out.println("Enter ChoclateId:");
//			int a=sc.nextInt();
//			System.out.println("Enter Choclate Name:");
//			String b=sc.next();
//			System.out.println("Enter the company of choclate:");
//			String c=sc.next();
//			preparedstatement.setInt(1, a);
//			preparedstatement.setString(2,b);
//			preparedstatement.setString(3, c);
//			int i=preparedstatement.executeUpdate();
//			System.out.println(i+" "+"Record Inserted Successfully!");
//			System.out.println("Do you want to insert another record the Press Y for Yes N for No");
//			String j=sc.next();
//			if(j.equals("n"))
//			break;
//			System.out.println("Thank you!!");
		
		
			//Updating the records in database.
//		PreparedStatement preparedstatement= connection.prepareStatement("update FavChoclate set chocId=6 where company='Star'");
//	int i=	preparedstatement.executeUpdate();
//			System.out.println("Record Updated Successfully"+ " "+ i);
		
		
		//Delete the record from databse.
//		PreparedStatement preparedstatement=connection.prepareStatement("Delete From FavChoclate where chocId=3");
//		int i =preparedstatement.executeUpdate();
//		System.out.println("Record deleted Successfully!!"+ " "+i);
	ResultSet resultset=preparedstatement.executeQuery("Select * from FavChoclate");
	while(resultset.next()) {
		System.out.println("chocId="+resultset.getInt(1));
		System.out.println("name="+resultset.getString(2));
		System.out.println("company="+resultset.getString(3));
	}
		
			preparedstatement.close();
			connection.close();
		}
	}


