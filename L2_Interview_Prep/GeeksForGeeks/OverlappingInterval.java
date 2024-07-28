package L2_Interview_Prep.GeeksForGeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlappingInterval {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 4}, {6, 8}, {9, 10}};
        int[][] arr1 = {{6, 8}, {1, 9}, {2, 4}, {4, 7}};

        int[][] res1 = mergeIntervals(arr);
        int[][] res2 = mergeIntervals(arr1);

        System.out.println("Merged Intervals for arr:");
        for (int[] interval : res1) {
            System.out.print(Arrays.toString(interval) + " ");
        }

        System.out.println("\nMerged Intervals for arr1:");
        for (int[] interval : res2) {
            System.out.print(Arrays.toString(interval) + " ");
        }
    }

    private static int[][] mergeIntervals(int[][] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        merged.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int[] lastInterval = merged.get(merged.size() - 1);

            if (arr[i][0] <= lastInterval[1]) {
                lastInterval[1] = Math.max(lastInterval[1], arr[i][1]);
            } else {
                merged.add(arr[i]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
