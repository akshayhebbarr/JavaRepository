package com.java.collection;
import java.util.*;
import java.util.Vector;
public class Vectr {
public static void main(String args[])
{
	Vector<String> vctr=new Vector<String>();
	vctr.add("Zack");
	vctr.addElement("Bon Jovi");
	vctr.add("Akshay");
	vctr.add("kash");
	System.out.println("Vector before sorting:");
	for(int i=0;i<vctr.size();i++)
	{
		System.out.println(vctr.get(i));
	}
	Collections.sort(vctr);
	System.out.println("Vector after sorting:");
	for(int i=0;i<vctr.size();i++)
	{
		System.out.println(vctr.get(i));
	}
}
}
