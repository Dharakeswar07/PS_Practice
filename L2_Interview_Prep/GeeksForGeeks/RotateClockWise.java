package L2_Interview_Prep.GeeksForGeeks;

public class RotateClockWise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    /*private static void rotate(int[] arr) {
        int n = arr.length;
        if (n == 0) return;
        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }*/

    private  static  void  rotate(int[] arr)
    {
        int n=arr.length;
        int[] res=new int[n];
        res[0]=arr[n-1];
        int j=1;
        for(int i=0;i<n-1;i++)
        {
            res[j++]=arr[i];
        }
        int k=0;
        for(int i:res)
        {
            arr[k]=i;
            k++;
        }
    }
}
