package com.java.exceptionhandling;
import java.util.Scanner;
public class NullpointerExcep {
	static void getlength(String text)
	{
		try
		{
			System.out.println("length of input string is:"+text.length());
		}catch(Exception e)
		{
			System.out.println("exception while trying to find the length of string"+e);
		}
	}
public static void main(String args[])
{
	Scanner demo=new Scanner(System.in);
	System.out.println("Enter length of string:");
	String text = demo.nextLine();
	if(text.length()==0)
	{
		text=null;
	}
	getlength(text);
}
}
