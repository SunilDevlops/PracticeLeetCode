package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
	    
	    /* Tine : O(n2)   Space : O(n)
	    
	    for (int i =0; i<nums.length; i++) {
	        for(int j=i+1; j<nums.length; j++){
	            if(nums[j] == target-nums[i]) {
	                return new int[]{i, j};
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	    
	    */
	    
	    /* Tine : O(n)   Space : O(n)
	    
	    Map<Integer, Integer> map = new HashMap<>();
	    for(int i = 0; i< nums.length; i++) {
	        map.put(nums[i], i);
	    }
	    for(int i = 0; i < nums.length; i++) {
	        int complement = target - nums[i];
	        if(map.containsKey(complement) && map.get(complement) != i){
	            return new int[]{i, map.get(complement)};
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	    
	    */
		
		// Tine : O(n)   Space : O(n)
	    
	    Map<Integer, Integer> map = new HashMap<>();
	    for(int i =0; i< nums.length; i++) {
	        int complement = target - nums[i];
	        if(map.containsKey(complement) && map.get(complement) != i){
	            return new int[]{map.get(complement), i};
	        }
	        map.put(nums[i], i);
	    }
	    
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void main(String[] str ){
		int[] nums = {2, 5, 7};
		int target =  9;
		int[] list = twoSum(nums, target);
		System.out.println("List of index - " +Arrays.toString(list));
	}

	
	
}
