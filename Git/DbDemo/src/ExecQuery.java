import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class ExecQuery {
static final String JDBC_DRIVER="com.mysql.jdbc.driver.newInstance()";
static final String DB_URL="jdbc:mysql://localhost/emp";
static final String user="root";
static final String password="vigilante";
public static void main(String args[])
{
	Connection conn =null;
	Statement stmt=null;
	try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		System.out.println("Connecting to database...");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","vigilante");
		System.out.println("Creating a statement...");
		stmt=conn.createStatement();
		String sql;
		sql="SELECT id,age,name FROM emp";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			int id = rs.getInt("id");
			int age= rs.getInt("age");
			String name = rs.getString("name");
			System.out.println("ID:"+id);
			System.out.println("AGE:"+age);
			System.out.println("NAME:"+name);
		}
		rs.close();
		stmt.close();
		conn.close();
		}catch(Exception e)
	{
			e.printStackTrace();
	}
	System.out.println("GOODBYE");
}
}
