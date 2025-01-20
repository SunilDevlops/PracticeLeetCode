package PracticeLeetCode.Java.Arrays;
import java.util.Arrays;

public class Code3424_MinCostToMakeArraysIdentical {
    public static long minCost(int[] arr, int[] brr, long k) {
        long cost = 0;
        long costWithoutSort = calculateCost(arr, brr);
        Arrays.sort(arr);
        Arrays.sort(brr);
        long costWithSort = calculateCost(arr,brr) + k;

        cost = Math.min(costWithoutSort, costWithSort);
        
        
        return cost;
    }

    private static long calculateCost(int[] arr, int[] brr) {
        long sum = 0;

        for(int i = 0; i< arr.length;i++){
            sum = sum+ Math.abs(arr[i]-brr[i]);
        }
        return sum;
    }

    public static void main(String[] str){
        int[] arr = new int[]{2,1};
        int[] brr = new int[]{2,1};
        System.out.println(minCost(arr, brr, 2));
    }
}
