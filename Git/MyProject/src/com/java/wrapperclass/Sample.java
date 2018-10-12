package com.java.wrapperclass;

public class Sample {
	public static void main(String args[])
	{
		Integer wrapper1 = Integer.valueOf("12345");
		Integer wrapper2 = Integer.valueOf("11001",2);
		Integer wrapper3 = Integer.valueOf("A",16);
		System.out.println("value of integer wrapper:"+wrapper1);
		System.out.println("wrapper 2:"+wrapper2);
		System.out.println("wrapper 3:"+wrapper3);

	}

}
