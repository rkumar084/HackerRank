package com.hackerrank.ds.arrays;


//Given an array nums of n integers where nums[i] is in the range [1, n], 
//return an array of all the integers in the range [1, n] that do not appear in nums.
		
public class FindDisappearedNumbers {

	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
       // List<Integer> res = new ArrayList<Integer>();
        int i = 0;
        int nextIndex = -1;
        int currIndex = nums[0];
        while (i < nums.length) {
            if (nums[i] == 0) {
                i++;
                continue;
            }
        	currIndex = nums[i];

            while(true) {
                if (nums[currIndex - 1] == 0) {
                    i++;
                    break;
                }
                nextIndex = nums[currIndex - 1];
                nums[currIndex - 1] = 0;
                currIndex = nextIndex;
            }
        }
        
        for (i = 0; i < nums.length; i++) {
            if (nums[i]!=0) {
                System.out.println(i+ ", ");
            }
        }
        
        
	}

}
