package com.java.interfaces;

interface MyInterface
{
	public void MyMethod1();
	public void MyMethod2();

}
class Demo implements MyInterface
{
	public void MyMethod1()
	{
		System.out.println("implementation of method 1");
	}
	public void MyMethod2()
	{
		System.out.println("implementation of method 2");
	}
	public static void main(String args[])
	{
		Demo samp = new Demo();
		samp.MyMethod1();
	}
}
