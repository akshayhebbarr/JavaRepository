
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbDemo {
	public static void main(String args[])
	{
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","vigilante");
			System.out.println("COnnection successful");
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}
}

