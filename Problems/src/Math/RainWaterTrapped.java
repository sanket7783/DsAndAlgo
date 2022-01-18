package Math;

/***
 * Written on 18/01/2022 by Sanket Hambir
 */


/**
 * Psuedo code
 */

public class RainWaterTrapped {

    public static void main(String[] args) {

        int[] Arr = {5,0,2};
        System.out.println(TrappedWater(Arr));

    }

    public static int TrappedWater(int[] Arr) {
        int n = Arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = Arr[0];
        for (int i=1; i<n; i++) {
            leftMax[i] =Math.max(leftMax[i-1], Arr[i]);
        }
        rightMax[n-1] = Arr[n-1];
        for (int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(Arr[i], rightMax[i+1]);
        }
        int res = 0;
        for(int i = 0; i<Arr.length; i++) {
            res += Math.min(leftMax[i], rightMax[i])-Arr[i];
        }
        return res;
    }
}
