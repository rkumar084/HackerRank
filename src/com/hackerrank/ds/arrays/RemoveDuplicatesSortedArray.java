package com.hackerrank.ds.arrays;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		int[] nums = {1,1,2};

        int k = 1;
        int i = 0;
         
        boolean found = false; 
        int foundIndex = -1;
        while(i<nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
                if (found == false) {
                    found = true;
                    foundIndex = i + 1;
                }
                i++;
            } else if (found) {
                nums[foundIndex] = nums[i + 1];
                k++;
                found = false;
                i++;
            } else {
                k++;
                i++;
            }
        }
        
        System.out.println("K=" + k);
        for(int a: nums) {
        	System.out.print(a + ",");
        }
	}

}
