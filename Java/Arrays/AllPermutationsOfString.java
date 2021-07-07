public class AllPermutationsOfString {

    public static void main(String s[]) {
        String str = "ABCD";
        int len = str.length();
        AllPermutationsOfString per = new AllPermutationsOfString();
        per.permute(str, 0, len-1);

    }

    private void permute(String str, int i, int j) {
        if(i == j) {
            System.out.println(str);
        } else {
            for(int k = i; k <= j; k++){
                str = swap(str, i, k);
                permute(str, i+1, j);
                str = swap(str, i, k);
            }
        }
    }

    private String swap(String str, int i, int k) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[k];
        charArray[k] = temp;
        return String.valueOf(charArray);
    }
}
