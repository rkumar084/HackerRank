package com.hackerrank.ds.arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		int m = 3;
		int n=3;
		int[] nums1 = {4,5,6,0,0,0};
		int[] nums2 = {1,2,3};
		
        int i = m-1,j=n-1;
        int revIndex = m+n-1;
        while (i>-1 && j>-1) {
            
            if (nums1[i] > nums2[j]) {
                nums1[revIndex] = nums1[i];
                i--;
            } else  {
                nums1[revIndex] = nums2[j];
                j--;
            }
            revIndex--;
        }        
        
        /*while(m>-1) {
            nums1[revIndex] = nums1[m];
            m--;
            revIndex--;
        }*/
        while(j>-1) {
            nums1[revIndex] = nums2[j];
            j--;
            revIndex--;
        }
        
        for (int a: nums1) {
        	System.out.print(a + ",");
        }
        
	}

}
