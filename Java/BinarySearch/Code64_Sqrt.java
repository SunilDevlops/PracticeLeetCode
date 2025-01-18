package PracticeLeetCode.Java.BinarySearch;

public class Code64_Sqrt {

    public static void main(String[] args){
        int result = mySqrt(5);
        System.out.println(result);

    }
    public static int mySqrt(int x) {
        if(x < 2) return x;
        int pivot, left =2, right = x/2;
        long num;
        while(left <= right){
            pivot = left + (right-left)/2;
            num = (long) pivot * pivot;
            if(num > x)
                right = pivot - 1;
            else if(num < x)
                left = pivot + 1;
            else
                return pivot;
        }
        return right;
    }
}
