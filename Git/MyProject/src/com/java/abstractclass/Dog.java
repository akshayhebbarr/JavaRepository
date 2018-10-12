package com.java.abstractclass;
abstract class Animal
{
	public abstract void sound();
}
public class Dog extends Animal
{
	public void sound()
	{
		System.out.println("bark");
	}
	public static void main(String args[])
	{
		Animal samp = new Dog();
		samp.sound();
	}
}
