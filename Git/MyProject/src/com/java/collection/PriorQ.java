package com.java.collection;
import java.util.*;
import java.util.PriorityQueue;
import java.util.Iterator;
public class PriorQ {
public static void main(String args[])
{
	PriorityQueue<String> pqueue=new PriorityQueue<String>();
	pqueue.add("akshay");
	pqueue.add("akash");
	pqueue.add("adi");
	pqueue.add("ak");
	System.out.println("Priority of elements:"+pqueue.peek());
	System.out.println("All elements of queue are:");
	Iterator<String> itr=pqueue.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	pqueue.poll();
	System.out.println("After removing queue using poll function");
	Iterator<String> itr1=pqueue.iterator();
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
	}
	pqueue.remove("adi");
	System.out.println("After removing from queue");
	Iterator<String> itr2=pqueue.iterator();
	while(itr2.hasNext())
		{
		System.out.println(itr2.hasNext());
		}
}
}