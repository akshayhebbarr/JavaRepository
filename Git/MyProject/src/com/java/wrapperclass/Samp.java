package com.java.wrapperclass;

public class Samp {
	public static void main(String args[])
	{
		char ch='a';
		Character obj = Character.valueOf(ch);
		System.out.println(ch+" "+obj);
		Double demo = new Double(14.6);
		double no = demo.doubleValue();
		System.out.println(no+" "+demo);
		
	}

}
