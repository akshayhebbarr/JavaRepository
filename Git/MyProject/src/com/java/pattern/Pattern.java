package com.java.pattern;

public class Pattern {
public static void main(String args[])
{
	int i,j,s=4,l=1;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=s;j++)
		{
			System.out.print("*");
		}
		for(j=1;j<=l;j++)
		{
			System.out.print(" ");
		}
		System.out.println();
		s--;
		l+=2;
	}
}
}
