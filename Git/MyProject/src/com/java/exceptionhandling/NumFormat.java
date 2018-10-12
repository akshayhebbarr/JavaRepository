package com.java.exceptionhandling;

public class NumFormat {
	public static void main(String args[])
	{
		String str1="10";
		int x = Integer.parseInt(str1);
		System.out.println(x+x);
		try
		{
			String str2="ten";
			int y=Integer.parseInt(str2);
		}catch(Exception e)
		{
			System.out.println("Exception caught:"+e);
		}
	}
}
