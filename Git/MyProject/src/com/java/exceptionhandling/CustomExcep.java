package com.java.exceptionhandling;

public class CustomExcep {
	static void validate(int age)throws Exception
	{
		if(age<18)
			throw new Exception("not valid");
		else
			System.out.println("Welcome to vote");
	}
	public static void main(String args[])
	{
		try{
			validate(12);
		}catch(Exception e)
		{
			System.out.println("Exception caught:"+e);
		}
	}

}
