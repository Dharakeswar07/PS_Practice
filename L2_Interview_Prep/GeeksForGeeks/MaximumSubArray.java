package L2_Interview_Prep.GeeksForGeeks;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 5};
        System.out.println(sumOfArray(arr));
    }
// DP Method
    private static long sumOfArray(int[] arr) {
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        int maxSum = dp[0];
        for (int i = 1; i < arr.length; i++) {
            dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
            maxSum = Math.max(maxSum, dp[i]);
        }
        return maxSum;
    }
// Kadane’s Algorithm
    /*private static long sumOfArray(int[] arr) {
        int maxEndingHere = arr[0];
        long maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;

    }*/
}
