package com.java.instancevar;

public class Sample {
	public String name;
	private int age;
	public Sample(String RecName)
	{
		name=RecName;
	}
	public void setAge(int RecAge)
	{
		age=RecAge;
	}
	public void printRec()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
	public static void main(String args[])
	{
		Sample demo = new Sample("akshay");
		demo.setAge(22);
		demo.printRec();
	}

}
