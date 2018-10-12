package com.java.databaseconn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnect {
public static void main(String args[])
{
	try{
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
		System.out.println("COnnection successful");
	}catch(Exception e)
	{
		System.err.println(e);
	}
}
}
