package com.hackerrank.sort;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class QuickSort
{

    
    static List<Integer> quickSortAlg(List<Integer> ar) 
    {
	int len = ar.size();

	/***** validation *******/
	if (len > 1000 || len < 1)
	    return new ArrayList<Integer>();
	for (int n : ar)
	{
	    if (n > 10000 || len < -10000)
		return null;
	}
	
	if (hasDuplicates(ar))
	    return null;
	/***** validation ends *******/

	if (len == 1)
	{
	    return ar;
	}
	
	List<Integer> ll1 = new ArrayList<Integer>();
	List<Integer> ll2 = new ArrayList<Integer>();
	Integer num = null;
	
	for( int n : ar )
	{    
	    if ( num == null)  
	    {
		num = n;
		continue;
	    }
	    if (n <= num ) 
		ll1.add(n);
	    else 
		ll2.add(n);
	}
	
	ll1 = quickSortAlg(ll1);
	ll2 = quickSortAlg(ll2);
	
	// merging below
	ll1.add(num);
	ll1.addAll(ll2);

	printArray(ll1);
	return ll1;
    } 
    
    public static boolean hasDuplicates(List<Integer> ar)
    {
	final List<Integer> present = new ArrayList<Integer>();
	for (Integer n : ar)
	{
	    if (present.contains(n))
	    {
		return true;
	    }
	    present.add(n);
	}
	return false;
    }
    
    static void printArray(List<Integer> ar)
    {
	for (int n : ar)
	{
	    System.out.print(n + " ");
	}
	System.out.println("");
    }

    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	Integer[] ar = new Integer[n];
	for (int i = 0; i < n; i++)
	{
	    ar[i] = in.nextInt();
	}
	in.close();
	quickSortAlg(Arrays.asList(ar));
//	if (ar.length == 1)
//	    System.out.println(ar[0]);
    }	
	
}
