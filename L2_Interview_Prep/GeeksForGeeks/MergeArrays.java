package L2_Interview_Prep.GeeksForGeeks;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        long[] arr={10,12};
        long[] arr1={5,18,20};
        mergeArray(arr,arr1,arr.length,arr1.length);
        for(long i:arr)
        {
            System.out.print(i+" ");
        }
        for(long i:arr1)
        {
            System.out.print(i+" ");
        }
    }
   /* private static void mergeArray(long[] arr,long[] arr1,int n,int m){
        for(int i=0;i<m;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[j]>arr1[i])
                {
                    long temp=arr[j];
                    arr[j]=arr1[i];
                    arr1[i]=temp;
                }
            }
        }
        Arrays.sort(arr1);
    }*/

    // Gap  Method
    private static void mergeArray(long[] arr, long[] arr1, int n, int m) {
        int totalLength = n + m;
        int gap = totalLength / 2;

        // Use the gap method
        while (gap > 0) {
            int i = 0;
            int j = gap;

            while (j < totalLength) {
                if (j < n && arr[i] > arr[j]) {
                    // Swap elements within the first array
                    long temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else if (j >= n && i < n && arr[i] > arr1[j - n]) {
                    long temp = arr[i];
                    arr[i] = arr1[j - n];
                    arr1[j - n] = temp;
                } else if (j >= n && i >= n && arr1[i - n] > arr1[j - n]) {
                    long temp = arr1[i - n];
                    arr1[i - n] = arr1[j - n];
                    arr1[j - n] = temp;
                }
                i++;
                j++;
            }

            if (gap == 1) {
                break;
            }

            gap = (gap + 1) / 2;
        }
    }
}
