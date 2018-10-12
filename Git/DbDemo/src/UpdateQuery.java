import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class UpdateQuery {
	public static void main(String args[])
	{
		Connection conn=null;
		Statement stmt=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","vigilante");
			stmt=conn.createStatement();
			String query="update emp set age=26 where id=1";
			int count=stmt.executeUpdate(query);
			System.out.println("Table updated"+count);
			ResultSet rs=stmt.executeQuery("select * from emp");
			System.out.println("id   name    age");
			while(rs.next())
			{
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int age=rs.getInt("age");
				System.out.println(id+"   "+name+"   "+age);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
		try{
			if(stmt!=null)
				stmt.close();
			if(conn!=null)
				conn.close();
	}catch(Exception ex)
		{}
		}
	}
	}