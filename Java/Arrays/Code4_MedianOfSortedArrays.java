package PracticeLeetCode.Java.Arrays;

public class Code4_MedianOfSortedArrays {

    public static void main(String[] args){
        int[] nums1 = new int[]{1,3};
        int[] nums2 = new int[]{2,4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int input1 = nums1.length;
        int input2 = nums2.length;
        if(input1 > input2){
            int[] tmp = nums1;
            nums1 = nums2;
            nums2 = tmp;
        }

        int lo = 0;
        int hi = nums1.length;
        int combinedLength = input1+input2;
        while(lo <= hi){
            int partX = (lo+hi)/2;
            int partY = (combinedLength+1)/2 - partX;

            int leftX = getMax(nums1, partX);
            int rightX = getMin(nums1, partX);

            int leftY = getMax(nums2, partY);
            int rightY = getMin(nums2, partY);

            if(leftX <= rightY && leftY <= rightX){
                if(combinedLength % 2 == 0)
                    return (Math.max(leftX, leftY) + Math.min(rightX, rightY))/2.0;
                else
                    return Math.max(leftX, leftY);
            }
            if(leftX > rightY){
                hi = partX - 1;
            }else {
                lo = partX + 1;
            }

        }
        return -1;
    }

    private static int getMax(int[] nums, int partition) {
        if(partition == 0)
            return Integer.MIN_VALUE;
        return nums[partition-1];
    }

    private static int getMin(int[] nums, int partition) {
        if(partition == nums.length)
            return Integer.MAX_VALUE;
        return nums[partition];
    }
}
