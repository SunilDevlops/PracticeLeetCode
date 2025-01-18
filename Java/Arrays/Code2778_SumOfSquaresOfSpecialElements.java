package PracticeLeetCode.Java.Arrays;

public class Code2778_SumOfSquaresOfSpecialElements {
    public static void main(String[] args){
        int[] nums = new int[] {2,7,1,19,18,3};
        System.out.println(sumOfSquares(nums));

    }

    private static int sumOfSquares(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for(int i=1; i<=len; i++){
            if(len%i == 0)
                sum = sum + nums[i-1]*nums[i-1];
        }
        return sum;
    }
}
