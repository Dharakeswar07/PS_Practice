package L2_Interview_Prep.Sheet;

import java.util.Arrays;
import java.util.Collections;

public class ChangeOddEven {
    public static void main(String[] args) {
        long[] arr={1, 2, 3, 5, 4, 7, 10};
        changePosition(arr);
        for(long i:arr)
        {
            System.out.print(i+" ");
        }
    }

    private static void changePosition(long[] arr) {
        int oddCount = 0;
        for (long num : arr) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }

        long[] odd = new long[oddCount];
        long[] even = new long[arr.length - oddCount];

        int oddIndex = 0, evenIndex = 0;
        for (long num : arr) {
            if (num % 2 != 0) {
                odd[oddIndex++] = num;
            } else {
                even[evenIndex++] = num;
            }
        }

        Arrays.sort(odd);
        for (int i = 0; i < odd.length / 2; i++) {
            long temp = odd[i];
            odd[i] = odd[odd.length - i - 1];
            odd[odd.length - i - 1] = temp;
        }

        Arrays.sort(even);

        int index = 0;
        for (long num : odd) {
            arr[index++] = num;
        }
        for (long num : even) {
            arr[index++] = num;
        }
    }
}
