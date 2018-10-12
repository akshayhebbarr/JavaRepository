package com.java.collection;
import java.util.*;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Map;
public class LinkdHashMap {
public static void main(String args[])
{
	LinkedHashMap<String, Integer> lhmap=new LinkedHashMap<String, Integer>();
	lhmap.put("Akshay", 6);
	lhmap.put("Abhi", 7);
	lhmap.put("Akash", 8);
	Set set=lhmap.entrySet();
	Iterator itr=set.iterator();
	while(itr.hasNext())
	{
		Map.Entry me=(Map.Entry)itr.next();
		System.out.println("Key is:"+me.getKey()+ "\nValue is:"+me.getValue()+"\n");
	}
}
}
