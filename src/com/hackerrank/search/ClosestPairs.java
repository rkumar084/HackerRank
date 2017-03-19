package com.intvstrt.search;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class ClosestPairs
{

    
    private static void FindClosestPairs(int[] a)
    {
	Arrays.sort(a);
	int len = a.length;
	int minDiff = 10000000;
	int temp = 0;
	for (int i = 0 ; i < len -1 ; i ++)
	{
	    temp =  Math.abs(a[i] - a[i+1]);
	    if (minDiff > temp)
		minDiff = temp;
	}
	
	for (int i = 0 ; i < len -1 ; i ++)
	{
	    temp =  Math.abs(a[i] - a[i+1]);
	    if (minDiff == temp)
		System.out.print(" "+a[i] + " " + a[i+1]);
	}
	
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        FindClosestPairs(_a);
        
    }    
    
}
