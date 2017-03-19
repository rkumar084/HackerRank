package com.intvstrt.sort;

import java.util.Scanner;
import java.util.LinkedList;

public class QuickSortPart1
{

    
    static void partition(int[] ar) 
    {
	int len = ar.length;

	/***** validation *******/
	if (len > 1000 || len < 1)
	    return;
	for (int n : ar)
	{
	    if (n > 10000 || len < -10000)
		return;
	}
	/***** validation ends *******/
	Integer[] ar1;
	if (len == 1)
	{
	    ar1 = new Integer[1];
	    ar1[0] = ar[0];
	    printArray(ar1);
	    return;
	}
	
	LinkedList<Integer> ll1 = new LinkedList<Integer>();
	LinkedList<Integer> ll2 = new LinkedList<Integer>();
	int num = ar[0];
	
	for( int i =1; i< len; i++)
	{    
	    if (ar[i] <= num ) 
		ll1.add(ar[i]);
	    else 
		ll2.add(ar[i]);
	}
	ll1.add(num);
	ll1.addAll(ll2);
	ar1 = ll1.toArray(new Integer[ll1.size()]);
	printArray(ar1);
    } 
    
    static void printArray(Integer[] ar)
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
	int[] ar = new int[n];
	for (int i = 0; i < n; i++)
	{
	    ar[i] = in.nextInt();
	}
	in.close();
	partition(ar);
	// printArray(ar);
    }	
	
}
