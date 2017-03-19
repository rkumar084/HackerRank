package com.intvstrt.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Sample2
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	List<Integer> intList = new ArrayList<Integer>();
	List temp = null; 
	Map m = new HashMap();
	intList.add(1);
	intList.add(2);
	intList.add(3);
	
	m.put("asd",intList);
	temp = (List<Integer>)m.get("asd");
	printList(temp);
	System.out.println("--------------------");
	intList.add(6);
	intList.add(7);
	intList.add(8);
	m.put("asd",intList);
	temp = (List<Integer>)m.get("asd");
	printList(temp);	
	
		
    }
    
    private static void printList(List l)
    {
	Iterator itr = l.iterator();
	while (itr.hasNext())
	{
	    System.out.println("asdfasdf-- "+itr.next().toString());
	}
	
    }

}
