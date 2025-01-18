package Arrays;

public class Code35_SearchInsertPosition {
    public static void main(String[] args){
        int[] nums = new int[]{1,3,5,6};
        int result = searchInsert(nums, 5);
        System.out.println(result);

    }

    private static int searchInsert(int[] nums, int target) {
        int pivot = 0, left = 0, right = nums.length - 1;
        while(left<=right){
            pivot = left + (right-left)/2;
            if(nums[pivot]==target) return pivot;
            if(target < nums[pivot])
                right = pivot - 1;
            else
                left = pivot + 1;
        }
        return left;
    }
}
