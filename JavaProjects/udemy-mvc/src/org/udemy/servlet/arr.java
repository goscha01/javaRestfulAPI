package org.udemy.servlet;

import java.util.Arrays;
import java.util.Collections;

public class arr {

	//2,3,-1,8,4
	    public static int findMiddleIndex(int[] nums) {
	        int[] prefix = new int[nums.length];
	        prefix[0] = nums[0];
	        for(int i=1; i< nums.length; i++) {
	            prefix[i] = prefix[i-1] + nums[i];
	        }
	        
	        int[] prefixR = new int[nums.length];
	        prefixR[nums.length-1] = nums[nums.length-1];
	        for(int i=nums.length-2; i> 0; i--) {
	            prefixR[i] = prefixR[i+1] + nums[i];
	        }
	        
	        
	        System.out.println("prefix: " + Arrays.toString(prefix));
	        System.out.println("prefixR: " + Arrays.toString(prefixR));

	        for(int i = 1; i< nums.length; i++ ) {
	            int left = prefix[i-1];
	            int right = prefixR[i+1];
	            System.out.println("i: " + i);
	            System.out.println("left: " + left);
	            System.out.println("right: " + right);
	            if(left == right) {
	                    return i;
	                } 
	            }    
	         return -1;    
	    }


}
