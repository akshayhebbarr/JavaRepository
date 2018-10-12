package com.java.exceptionhandling;

public class ArrayOutInd {
	static void PrintArray()
	{
		try{
			String[] str1=new String[]{"one","two","three","four"};
			System.out.println(str1[10]);
		}catch(Exception e)
		{
			System.out.println("Exception is:"+e);
		}
	}
	public static void main(String args[])
	{
		PrintArray();
	}

}
