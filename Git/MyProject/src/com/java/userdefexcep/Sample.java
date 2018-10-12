package com.java.userdefexcep;
class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}
}
public class Sample {
	public static void main(String args[])
	{
		try
		{
			throw new MyException("sample");
		}catch(MyException e)
		{
			System.out.println("Caught");
			System.out.println(e.getMessage());
		}
	}

}
