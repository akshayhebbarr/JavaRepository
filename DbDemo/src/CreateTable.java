import java.sql.*;
public class CreateTable {
	public static void main(String args[])throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","vigilante");
		System.out.println("Connection successful");
		Statement stmt=conn.createStatement();
		System.out.println("Statement created");
		int i=stmt.executeUpdate("create table student(sid int,sname varchar(255),age int)");
		System.out.println("Result is:"+i);
		System.out.println("Table created");
		stmt.close();
		conn.close();
	}

}
