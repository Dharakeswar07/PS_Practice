package L2_Interview_Prep.GeeksForGeeks;
import java.util.Arrays;

public class MinimizeHeight {
    public static void main(String[] args) {
        int[] arr = {7,7,3,5};
        int k = 1;
        System.out.println(getMinDiff(arr, arr.length, k));
    }

    private static int getMinDiff(int[] arr, int n, int k) {
        if (n == 1) return 0;
        Arrays.sort(arr);
        int minDiff = arr[n - 1] - arr[0];

        int min, max;
        for (int i = 1; i < n; i++) {
            if (arr[i] >= k) {
                max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
                min = Math.min(arr[0] + k, arr[i] - k);

                minDiff = Math.min(minDiff, max - min);
            }
        }

        return minDiff;
    }
}
