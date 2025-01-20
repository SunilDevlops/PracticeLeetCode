package PracticeLeetCode.Java.Arrays;

public class Code26_RemoveDuplicatesFromSortedArray {

    public static void main(String[] args){
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }

    private static int removeDuplicates(int[] arr) {
        int insertIndex = 1;
        for(int i=1; i<arr.length;i++){
            if(arr[i-1] != arr[i]){
                arr[insertIndex] =  arr[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}
