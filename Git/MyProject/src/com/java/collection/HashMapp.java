package com.java.collection;
import java.util.HashMap;
import java.util.Map;
public class HashMapp {
	public static void main(String args[])
	{
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		print(map);
		map.put("akshay", 6);
		map.put("akash", 8);
		map.put("adi", 10);
		System.out.println("Size of map is:"+map.size());
		print(map);
		if(map.containsKey("ajay"))
		{
			Integer a = map.get("akshay");
			System.out.println("Key value for akshay is:"+a);
		}
		else
		{
			System.out.println("Map does not contain the element");
		}
		map.clear();
		System.out.println("Map is being cleared");
		print(map);
	}
	public static void print(Map<String, Integer> map)
	{
		if(map.isEmpty())
		{
			System.out.println("map empty");
		}
		else
		{
			System.out.println(map);
		}
	}

}
