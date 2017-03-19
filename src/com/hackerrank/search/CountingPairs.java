package com.hackerrank.search;

import java.util.*;

public class CountingPairs
{

    public static void countPairs(Set<Integer> nums, Integer k)
    {
	int count = 0;
	int matchLow = 0;
	int matchHigh = 0;
	
	for( Integer i : nums)
	{
	    matchHigh = k + i;
	    matchLow = i -k;
	    if (nums.contains(matchHigh)) 
		count++;
	    if (nums.contains(matchLow))
		count++;
	}
	System.out.println(count/2);
	return;	
    }
    
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);

	int n = in.nextInt();
	//Integer[] nums = new Integer[n];
	if ( n < 1 || n > 100000)
	    return;
	
	int k = in.nextInt();
	if (k <= 0 || k >= 1000000000)
	    return;
	Set<Integer> nums = new HashSet<Integer>();
	for (int i = 0; i < n; i++)
	{
	    int num = in.nextInt();
	    if (num > 2147483647 - k)
		return;
	    nums.add(num);
	}
	in.close();
	countPairs(nums,k);
//	if (ar.length == 1)
//	    System.out.println(ar[0]);
    }	    
}
