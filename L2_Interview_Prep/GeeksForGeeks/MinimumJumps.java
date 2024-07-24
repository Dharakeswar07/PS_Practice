package L2_Interview_Prep.GeeksForGeeks;

public class MinimumJumps {
    public static void main(String[] args) {
        int[] arr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr,arr.length));
    }
  /*  public static int minJumps(int[] arr, int n) {
        if(arr[0]==0) return -1;

        int jumps=0,i=0;
        while(i<n)
        {
            if(i>=n-1)
            {
                break;
            }
            i+=arr[i];
                jumps++;

        }
        return jumps;
    }*/

    private static int minJumps(int[] arr,int n)
    {
        if (n <= 1) {
            return 0;
        }

        if (arr[0] == 0) {
            return -1;
        }

        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + arr[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd >= n - 1) {
                    return jumps;
                }
            }

            if (farthest <= i) {
                return -1;
            }
        }

        return -1;
    }
}
