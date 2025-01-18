package PracticeLeetCode.Java.BinarySearch;

public class Code367_isPerfectSquare {
    public static void main(String[] args){
        System.out.println(isPerfectSquare(16));
    }

    private static boolean isPerfectSquare(int num) {
        if(num < 2)
            return true;
        long guessSquared;
        long x, left = 2, right = num/2;
        while(left <= right){
            x = left + (right-left)/2;
            guessSquared = (long) x * x;
            if(guessSquared == num)
                return true;
            if(guessSquared > num)
                right = x - 1;
            else
                left = x + 1;
        }
        return false;
    }


}
