package com.intvstrt.sort;

import java.util.*;

public class InsertElement
{

    static void insertionSort(int[] ar)
    {
	int len = ar.length;
	
	/***** validation *******/
	if (len >1000 || len < 1) return;
	for (int n : ar)
	{
	    if  (n > 10000 || len < -10000) return;
	}
	/***** validation ends *******/

	int num = ar[len -1];
	
	for (int i= len-2 ; i >= -1; i--)
	{
	    if (i == -1)
	    {	
		ar[0] = num;
		printArray(ar);		
	    }	
	    else if (ar[i] > num)
	    {
		ar[i+1] = ar[i];
//		if (i == 0)
//		    ar[i] = num;
		printArray(ar);		
	    } 
	    else
	    {
		ar[i+1] = num;
		printArray(ar);		
		break;
	    }
	}
	return;
    }

    /* Tail starts here */

    static void printArray(int[] ar)
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
	insertionSort(ar);
	// printArray(ar);
	// System.out.println("program ended");
    }

}
