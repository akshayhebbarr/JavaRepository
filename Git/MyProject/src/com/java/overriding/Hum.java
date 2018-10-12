package com.java.overriding;

public class Hum {
	//Overridden method
	public void eat()
	{
		System.out.println("Human is eating");
	}
}
class Man extends Hum{
	//Overriding method
	public void eat(){
		System.out.println("Boy is eating");
	}
	public static void main(String args[]) {
		Man obj = new Man();
		//This will call the child class version of eat()
		obj.eat();
	}
}
