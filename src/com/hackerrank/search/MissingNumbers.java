package com.hackerrank.search;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class MissingNumbers
{
    
    private static HashSet<Integer> missingNums(HashSet<Integer> a, HashSet<Integer> b)
    {
	//HashSet<Integer> result = new HashSet<Integer>();
	
	HashSet<Integer> result = a;
	
	result.removeAll(b);
	
	return result;
	
	
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int _a_size = Integer.parseInt(in.nextLine());
        HashMap<Integer,Integer>  a = new HashMap<Integer,Integer>();
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        Integer count = 0;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            
            count = a.get(_a_item);
            if (count != null )
                a.put(_a_item,count+1);
            else	
        	a.put(_a_item,1);
        }
        
        int _b_size = Integer.parseInt(in.nextLine());
        HashMap<Integer,Integer>  b = new HashMap<Integer,Integer>();
        int _b_item;
        next = in.nextLine();
        next_split = next.split(" ");
        
        TreeSet<Integer> bKeys = new TreeSet<Integer>();
        
        for(int _b_i = 0; _b_i < _b_size; _b_i++) {
            _b_item = Integer.parseInt(next_split[_b_i]);
            bKeys.add(_b_item);
            count = b.get(_b_item);
            if (count != null )
                b.put(_b_item,count+1);
            else	
        	b.put(_b_item,1);
        }
        
        
       // HashSet<Integer>  result = missingNums(_a,_b);
        Iterator<Integer> itr = bKeys.iterator();
        while (itr.hasNext())
        {
            Integer num = itr.next();
            if (num == 8622)
        	System.out.println("tue");
            Integer cnt = a.get(num);
            if (cnt == null || (cnt.intValue() != b.get(num).intValue()))
                System.out.print(num + " ");            
        }

        
        
    }      

}
