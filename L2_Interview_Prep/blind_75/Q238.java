package L2_Interview_Prep.blind_75;

import java.util.Arrays;

public class Q238 {
    public static void main(String[] args) {
        int[] num={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf1(num)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];

        int[] prefix=new int[n];
        prefix[0]=1;
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        int[] suffix=new int[n];
        suffix[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            suffix[i]=suffix[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++)
        {
            res[i]=prefix[i]*suffix[i];
        }
        return  res;
    }

    public static int[] productExceptSelf1(int[] nums)
    {
        int n=nums.length;
        int[] res=new int[n];

        Arrays.fill(res,1);

        int left=1;
        for(int i=0;i<n;i++)
        {
            res[i] =left;
            left *=nums[i];
        }

        int right=1;
        for(int i=n-1;i>=0;i--)
        {
            res[i] *=right;
            right *=nums[i];
        }
        return res;
    }

}
