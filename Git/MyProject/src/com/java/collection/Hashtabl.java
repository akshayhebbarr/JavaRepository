package com.java.collection;
import java.util.*;
import java.util.Hashtable;
import java.util.Enumeration;
public class Hashtabl {
	public static void main(String args[])
	{
		Enumeration names;
		String key;
		Hashtable<String, String> htable= new Hashtable<String, String>();
		htable.put("key1","Akshay");
		htable.put("key2", "Chiru");
		htable.put("key3", "Sruj");
		htable.put("key5", "Rakshit");
		names=htable.keys();
		while(names.hasMoreElements())
		{
			key=(String) names.nextElement();
			System.out.println("Key is:"+key+ "Values is:"+htable.get(key));
		}
	}

}
