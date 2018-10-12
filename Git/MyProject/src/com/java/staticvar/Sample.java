package com.java.staticvar;

public class Sample {
	static String name;
	static int age;
	static void display()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
	public static void main(String agrs[])
	{
		name = "AK";
		age=22;
		display();
	}
}
