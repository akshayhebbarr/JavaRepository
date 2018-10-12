package com.java.exceptionhandling;

public class StringIndex {
	public static void main(String args[])
	{
		try
		{
		String s = "This is Sparta";
		char c = s.charAt(26);
		System.out.println(c);
	}catch(Exception e)
		{
		System.out.println("Exception found:"+e);
		}
	}
}
