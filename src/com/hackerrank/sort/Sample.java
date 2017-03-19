package com.hackerrank.sort;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Sample {


    private static boolean isNonDecimal(Double d)
    {
	String str = d.toString();
	String decimalPart = str.substring(str.indexOf('.'));
	return true;
    }
	public static void main(String[] args)
	{
//	    Double d1 = -2.147483648E9;
//	    Double d2 = -2147483648.0 ;
//	    
//	    NumberFormat formatter = new DecimalFormat("###.#####");  
//	    String f = formatter.format(d1);  
//	    
//	    if (d1.equals(d2))
//		System.out.println("equal");
//
//	    System.out.println(f);
//	    //System.out.println(d1.toString());
	    
	    Long lnum = new Long("0098");
	    System.out.println(lnum);
	    System.out.println(lnum.toString());
	    
	}

}
