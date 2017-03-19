package com.hackerrank.search;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Median
{
    private static void printMedians(String s[], Integer x[])
    {
	int len = s.length;
	ArrayList<Integer> al = new ArrayList<Integer>();


	for (int i = 0; i < len; i++)
	{
	    if ("a".equals(s[i]))
	    {
		al = addElement(al, x[i]);
	    }
	    else if ("r".equals(s[i]))
	    {
		if (al.contains(x[i]))
		    al.remove(x[i]);
		else
		{
		    System.out.println("Wrong!");
		    continue;
		}
	    }
	    int size = al.size();
	    if (size == 0)
	    {
		System.out.println("Wrong!");
		continue;
	    }
	    Double median = 0.0;
	    if (size % 2.0 > 0)
	    {
		System.out.println(al.get(size / 2));
	    } else
	    {

		median = (al.get(size / 2)/1.0 + al.get(size / 2 -1)/1.0) / 2.0;
		// round the median here.
		String medianStr = median.toString();
		String decimalPart = medianStr
			.substring(medianStr.indexOf('.') + 1);
		NumberFormat formatter = new DecimalFormat("###.#####");  
		int Eindex = decimalPart.indexOf('E');
		if (Eindex == -1 && Integer.parseInt(decimalPart) == 0)
		{
		    System.out.println(median.longValue());
		}
		else if (Eindex > -1)
		{
		    System.out.println( formatter.format(median));
		}
		else
		{
		    System.out.println(medianStr);
		}
	    }
	}
	return;
    }

    private static ArrayList<Integer> addElement(ArrayList<Integer> al,
	    Integer n)
    {
	int len = al.size();
	if (len == 0)
	{
	    al.add(n);
	    return al;
	}
	int i = 0;
	for (; i < len; i++)
	{
	    if (al.get(i) >= n)
		break;
	}
	al.add(i, n);

	return al;
    }

    public static void main(String[] args)
    {
	      Scanner in = new Scanner(System.in);
	      
	      int N;
	      String s[];
	      Integer x[];
	      N = in.nextInt();
        	  
	      if ( N <=0 || N > 100000)
		  return;
	      // long startTime = System.currentTimeMillis();   
	      s = new String[N];
	      x = new Integer[N];
	      for(int i=0; i<N; i++)
	      {
		  try
		  {
              	      s[i] = in.next();
               	      x[i] = in.nextInt();
		  }catch(Exception e)
		  {
        		  
		  }
	      }
	      in.close();
	      printMedians(s,x);
	      
    }
}
