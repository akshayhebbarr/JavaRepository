import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class PreparedStatemnt {
	public static void main(String args[])
	{
		Connection conn=null;
		PreparedStatement prstmt=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Establishing connection");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","vigilante");
			System.out.println("Connection established");
			String query="insert into emp(id,name,age) values(?,?,?)";
			prstmt=conn.prepareStatement(query);
			prstmt.setInt(1, 001);
			prstmt.setString(2,"John");
			prstmt.setInt(3,22);
			int count=prstmt.executeUpdate();
			prstmt.setInt(1,002);
			prstmt.setString(2,"Jack");
			prstmt.setInt(3,25);
			count=prstmt.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try{
				if(prstmt!=null)
					prstmt.close();
				if(conn!=null)
					conn.close();
			}catch(Exception ex){}
		}
	}
}