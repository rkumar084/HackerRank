package com.intvstrt.sort;

import java.util.*;

public class InsertionSortMoves
{

    static void insertionSortCountMoves(int[] ar)
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
	int count = 0;
	if ( len == 1)
	{
	    System.out.println(count);
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
		    count++;
		}
		else
		{
		    ar[i + 1] = num;
		    break;
		}
	    }
	}
	System.out.println(count);
	return;
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
	insertionSortCountMoves(ar);
	// printArray(ar);
	// System.out.println("program ended");
    }

}
