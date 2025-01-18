package PracticeLeetCode.Java.Arrays;

public class Code1588_SumOfAllOddLengthSubarrays {
    public static void main(String[] args){
        int[] nums = new int[] {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(nums));
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i=0; i< arr.length;i++){
            int left = i+1;
            int right = arr.length-i;
            int subArrays = left * right;
            int oddLengthArrays = subArrays % 2 == 0 ? (subArrays / 2) : (subArrays / 2)+1;
            sum = sum + oddLengthArrays * arr[i];
        }
        return sum;
    }

}
