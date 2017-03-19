package com.hackerrank.sort;

import java.util.*;

public class InsertionSort
{

    static void insertionSortAlg(int[] ar)
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

	int num = 0;
	if ( len == 1)
	{
	    printArray(ar);
	    return;
	}
	for (int j = 1; j < len; j++)
	{
	    num = ar[j];
	    for (int i = j - 1; i >= -1; i--)
	    {
		if (i == -1)
		{
		    ar[0] = num;
		} 
		else if (ar[i] > num)
		{
		    ar[i + 1] = ar[i];
		    // if (i == 0)
		    // ar[i] = num;
		}
		else
		{
		    ar[i + 1] = num;
		    break;
		}
	    }
	    printArray(ar);
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
	insertionSortAlg(ar);
	// printArray(ar);
	// System.out.println("program ended");
    }

}
