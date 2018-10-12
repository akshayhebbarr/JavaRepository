package com.java.threads;

public class ThreadJoin extends Thread {
	public void run()
	{
		for(int i=1;i<=6;i++)
		{
			try{
				Thread.sleep(600);
			}catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String args[])
	{
		ThreadJoin t1=new ThreadJoin();
		ThreadJoin t2=new ThreadJoin();
		ThreadJoin t3=new ThreadJoin();
		t1.start();
		try{
			t1.join(25550);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}
}
