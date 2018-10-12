package com.java.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ArrList {
public static void main(String args[])
{
	ArrayList<Character> array=new ArrayList<Character>();
	array.add('A','B');
	System.out.println("Before reversing:"+array);
	Collections.reverse(array);
	System.out.println("After reversing:"+array);
}
}
