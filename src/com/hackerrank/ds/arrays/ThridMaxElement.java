package com.hackerrank.ds.arrays;

public class ThridMaxElement {

	public static void main(String[] args) {
		int[] nums = {-2147483648,1,2};
        if (nums.length == 1) {
        	System.out.println(nums[0]);
        	return;
        }
        
        if (nums.length == 2) {
        	System.out.println(Math.max(nums[0], nums[1]));
        	return;

        }
        
        int minVal = nums[0];
        for (int i = 0; i< nums.length; i++) {
            if (minVal > nums[i]) {
                minVal = nums[i];
            }
        }

        //boolean found1 = false;
        int max1 = nums[0];
        int max2RefIndex = -1;
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] >= max1) {
                max1= nums[i];
          //      found1=true;
            } 
//            else {
//                max2RefIndex = i;
//            }
        }

//        if (max2RefIndex == -1) {
//        	System.out.println(max1);
//        	return;
//        }

       System.out.println("max1 = " + max1);
//        boolean found2 = false;
        int max2 = minVal;
        //int max3RefIndex = -1;
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] == max1) {
                continue;
            }
            if (nums[i] >= max2) {
                max2= nums[i];
                //found2=true;
            } 
            
//            else {
//                max3RefIndex = i;
//            }
        }

//        if (max3RefIndex == -1) {
//        	System.out.println(max1);
//            return;
//        }

       System.out.println("max2 = " + max2);
//        boolean found3 = false;
        int max3 = minVal;
        for (int i = 0; i< nums.length; i++) {
            if (nums[i] == max1 || nums[i] == max2) {
                continue;
            }
            if (nums[i] >= max3) {
                max3= nums[i];
               // found3=true;
            } 
        }
        
        
        System.out.println("max3 = " + max3);
        
        if (max1 == max2 || max2 == max3 || max1 == max3) {
        	System.out.println("ans = " + max1);
        	return;
        }
    	System.out.println("ans = " + max3);
	}

}
