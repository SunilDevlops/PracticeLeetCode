package PracticeLeetCode.Java.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Code39_CombinationSum {
    public static void main(String[] args){
        int[] nums = new int[]{2,3,6,7};
        List<List<Integer>>  result = combinationSum(nums, 7);
        System.out.println(result);

    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, result, new ArrayList<>());
        return result;
    }
    public static void backtrack(int[] arr, int target, int index, List<List<Integer>> result, List<Integer> ds){
        if(index == arr.length){
            if(target == 0){
                result.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[index] <= target){
            ds.add(arr[index]);
            backtrack(arr, target-arr[index], index, result, ds);
            ds.remove(ds.size()-1);
        }
        backtrack(arr, target, index+1, result, ds);
    }

}
