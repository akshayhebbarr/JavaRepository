package com.java.threads;

class MyRunnableThread implements Runnable {
	public static int count =0;
	public MyRunnableThread()
	{
		
	}
public void run()
{
	while(MyRunnableThread.count<=10)
	{
		try{
			System.out.println("Thread:"+(++MyRunnableThread.count));
			Thread.sleep(100);
	}catch(Exception e)
	{
		System.out.println("Exception in thread"+e.getMessage());
	}
}
}
}
public class RunMyThread {
	public static void main(String a[])
	{
		System.out.println("Running main thread...");
		MyRunnableThread mrt = new MyRunnableThread();
		Thread t = new Thread(mrt);
		t.start();
		while(MyRunnableThread.count<=10)
		{
			try
			{
				System.out.println("Thread:"+(++MyRunnableThread.count));
				Thread.sleep(100);
			}catch(Exception e)
			{
				System.out.println("Exception in main thread"+e.getMessage());
			}
		}
	}
}