package PracticeLeetCode.Java.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Code1_TwoSum {
    public static void main(String[] args){
        int[] arr = new int[]{2,7,11,15};
        int[] res = twoSum(arr, 9);
        for(int i: res){
            System.out.print(" " +i);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i], i);
        }
        for(int i =0; i<nums.length;i++){
            int complement = target - nums[i];
            if(hmap.containsKey(complement) && hmap.get(complement) != i){
                return new int[] {i, hmap.get(complement)};
            }
        }
        return new int[]{};
    }
}
