package Math;

/***
 * Written on 18/01/2022 by Sanket Hambir
 */

/***
 * Psuedo code
 *
 */


public class MaxAbsoluteDiff {

    public static void main(String[] args) {

        int[] arr = {3, -2, 5, -4};
        System.out.println(findMaxAbsoluteDiff(arr));
    }

    public static int findMaxAbsoluteDiff(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for( int i = 0; i<arr.length; i++) {
            max1 = Math.max(max1, arr[i]-i);
            max2 = Math.max(max2, arr[i]+i);
            min1 = Math.min(min1, arr[i]-i);
            min2 = Math.min(min2, arr[i]+i);
        }
        return Math.max(max1-min1, max2-min2);
    }
}
