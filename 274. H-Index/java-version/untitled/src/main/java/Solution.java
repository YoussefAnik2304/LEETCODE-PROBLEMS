import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations );
        reverse(citations);
        for (int i =0 ;i<citations.length;i++){
            if(i>=citations[i])
                return i;
        }
        return citations.length;
    }
    private static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}