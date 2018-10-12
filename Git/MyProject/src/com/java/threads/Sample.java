package com.java.threads;

public class Sample extends Thread {
	public void run()
	{
		System.out.println("Thread is running...");
	}
	public static void main(String args[])
	{
		Sample obj=new Sample();
		obj.start();
	}

}
