package com.java.collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSamp {
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println("The array list before sorting is:");
		for(String str: al){
			System.out.println(str);
		}
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("The array list after sorting is:");
		for(String str: al){
			System.out.println(str);
		}
	}

}
