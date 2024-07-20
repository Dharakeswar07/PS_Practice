package L2_Interview_Prep.GeeksForGeeks;

public class MinandMax {
    public static void main(String[] args) {
        long[] arr={1, 345, 234, 21, 56789};
        long[] res=findMinMax(arr);
            for(long i:res)
            {
                System.out.println(i);
            }
    }

    private static long[] findMinMax(long[] arr) {
        long min=arr[0],max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return new long[]{min,max};
    }
}
