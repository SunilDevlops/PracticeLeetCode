package PracticeLeetCode.Java.Matrix;

import java.util.HashMap;
import java.util.Map;

public class Code2661_FirstCompletelyPaintedRowOrCol {
    public static void main(String[] args){
        int[] arr = new int[]{1,3,4,2};
        int[][] mat = {
                {1,4},
                {2,3}
        };
        System.out.println(firstCompleteIndex(arr, mat));
    }

    private static int firstCompleteIndex(int[] arr, int[][] mat) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int i=0; i<arr.length;i++){
            hmap.put(arr[i], i);
        }
        int result = Integer.MAX_VALUE;
        int rows = mat.length;
        int cols = mat[0].length;
        for(int i =0; i<rows; i++){
            int lastElementIndex = Integer.MIN_VALUE;
            for(int j =0; j<cols;j++){
                int index = hmap.get(mat[i][j]);
                lastElementIndex = Math.max(lastElementIndex, index);
            }
            result = Math.min(result, lastElementIndex);
        }

        for(int i=0; i<cols;i++){
            int lastElementIndex = Integer.MIN_VALUE;
            for(int j=0;j<rows;j++){
                int index = hmap.get(mat[j][i]);
                lastElementIndex = Math.max(lastElementIndex, index);
            }
            result = Math.min(result, lastElementIndex);
        }

        return result;
    }
}
