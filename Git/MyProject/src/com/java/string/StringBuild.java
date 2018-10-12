package com.java.string;
import java.lang.*;

public class StringBuild {
	public static void main(String args[])
	{
		StringBuilder str1 = new StringBuilder("hello");
		str1.delete(1,3);
		System.out.println(str1);
	}

}
