package jdbcprogram;
import java.sql.*;
public class ResultSetMetaDataInterface {
public static void main(String args[])throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/collegedetails","root","Spriya@2001");
	Statement statement=connection.createStatement();
	//for creating a table in databse.query
//	statement.executeUpdate("Create Table User(useId int,name varchar(25),pswd varchar(20))");
//	System.out.println("Table created Successfully!!");
	
	//Inserting values into db query
//	int i=statement.executeUpdate("Insert into User Values(3,'ght','1001')");
//	System.out.println("Employee Inserted Succesfully"+ " "+ i);
	
	//updating
	
//	int i=statement.executeUpdate("update User set name='xyz' where useId=3 ");
//	 System.out.println("Records Updated Successfully!!" + " "+i);
	
	
	ResultSet resultSet = statement.executeQuery("SELECT * FROM User");
	
	ResultSetMetaData resultsetmeta=resultSet.getMetaData();
	
	System.out.println("Column Count="+resultsetmeta.getColumnCount());//getColumnCount()
	System.out.println("Colum Name="+resultsetmeta.getColumnName(2));
	System.out.println("Colum Name="+resultsetmeta.getColumnName(1));
	System.out.println("Colum Name="+resultsetmeta.getColumnName(3));//getColumnName(int)
	System.out.println("ColumnType="+resultsetmeta.getColumnTypeName(1));
	System.out.println("ColumnType="+resultsetmeta.getColumnTypeName(2));
	System.out.println("ColumnType="+resultsetmeta.getColumnTypeName(3));//getColumnTypeName(int)
	System.out.println("Column="+resultsetmeta.getSchemaName(1));
}
}
