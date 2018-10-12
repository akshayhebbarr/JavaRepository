package com.java.example;
import java.util.Scanner;
public class Addition{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the values for addition:");
		int num1 = obj.nextInt();
		int num2 = obj.nextInt();
		int num= num1+num2;
		System.out.println("The addition of two numbers is:"+num);
	}
}
