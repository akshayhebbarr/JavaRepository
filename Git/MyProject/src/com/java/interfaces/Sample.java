package com.java.interfaces;
interface I1
{
final int a=10;
public void display();
}
class Sample implements I1
{
	public void display()
	{
		System.out.println("this is how interfaces work");
	}
	public static void main(String args[])
	{
		Sample obj = new Sample();
		obj.display();
		System.out.println(a);
	}

}
