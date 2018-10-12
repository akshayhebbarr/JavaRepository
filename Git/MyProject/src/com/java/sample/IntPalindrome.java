package com.java.sample;
import java.util.Scanner;
public class IntPalindrome {
	public static void main(String args[])
	{
		Scanner read = new Scanner(System.in);
		System.out.println("Enter a number:");
		int palindrome = read.nextInt();
		
		if(isPalindrome(palindrome))
		{
			System.out.println("Number" +palindrome+ "is a palindrome");
		}
		else
		{
			System.out.println("Number" +palindrome+ "is not a palindrome");
		}
	}
	public static boolean isPalindrome(int number)
	{
		int palindrome = number;
		int reverse = 0;
		while(palindrome!=0)
		{
			int remainder = palindrome%10;
			reverse = reverse*10+remainder;
			palindrome = palindrome/10;
		}
		if(number==reverse)
		{
			return true;
		}
			return false;
	}

}
