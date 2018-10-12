package com.java.exceptionhandling;

import java.io.FileInputStream;
import java.io.*;
public class IoException {
	public static void main(String args[])
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("D:/myfile.txt");
		}catch(FileNotFoundException fnfe)
		{
			System.out.println("The specified file is not present" + "at given location");
		}
		int k;
		try
		{
			while((k=fis.read())!=-1)
			{
				System.out.println((char)k);
			}
			fis.close();
		}catch(IOException ioe)
		{
			System.out.println("IO error occurred:"+ioe);
		}
	}

}
