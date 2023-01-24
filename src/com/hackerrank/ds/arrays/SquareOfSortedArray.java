package com.hackerrank.ds.arrays;

public class SquareOfSortedArray {

	public static void main(String[] args) {
	    int[] nums = {-4,-1,0,3,10};
	        int[] res = new int[nums.length];
	        int negIndex = -1;
	        for (int a : nums) {
	            if (a<0) 
	                negIndex++;
	        }
	        
	        System.out.println("negIndex - " + negIndex);
	        
	        int posIndex = negIndex + 1;
	        int index = 0;
	        while(negIndex>=0 && posIndex<nums.length) {
	            if ((nums[negIndex]*-1) > nums[posIndex]){
	                res[index] = nums[posIndex];
	                posIndex++;
	                index++;
	            } else {
	                res[index] = nums[negIndex];
	                negIndex--;
	                index++;                
	            }
	        }
	        
	        System.out.println("negIndex - " + negIndex);
	        System.out.println("posIndex - " + posIndex);

	        
	        if (negIndex > -1) {
	            while(negIndex >=0) {
	                res[index] = nums[negIndex];
	                negIndex--;
	                index++;                
	            }
	        }
	        System.out.println("negIndex - " + negIndex);
	        System.out.println("posIndex - " + posIndex);

	        if (posIndex < nums.length) {
	            while(posIndex <nums.length) {
	                res[index] = nums[posIndex];
	                posIndex++;
	                index++;                
	            }
	        }

	        System.out.println("negIndex - " + negIndex);
	        System.out.println("posIndex - " + posIndex);

	        for(int i=0; i<res.length; i++){
	            res[i] *= res[i];
	            System.out.print("," + res[i]);
	        }
	        
	        
	        
	    
	}

}
