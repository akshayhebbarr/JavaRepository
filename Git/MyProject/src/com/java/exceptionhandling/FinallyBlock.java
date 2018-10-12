package com.java.exceptionhandling;

public class FinallyBlock {
	public static void main(String args[])
	{
		try
		{
			int a=20;
			int b=0;
			int d=a/b;
			System.out.println("division:"+d);
		}catch(Exception e)
		{
			System.out.println("Exception caught:"+e);
		}
		finally
		{
			System.out.println("finally block is always executed");
		}
	}
}
