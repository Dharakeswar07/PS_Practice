package L2_Interview_Prep.AlgoMap;

import java.util.Arrays;

public class FindClosestNumbertoZero_2239 {
    public static void main(String[] args) {
        int[] arr = {-4, -2, 1, 4, 8};
        int[] arr2 = {-2, -1, 1};
        int[] arr1 = {-100000, -100000};
        int[] arr3 = {2, 1, 1, -1, 100000};
        System.out.println(findClosestNumber(arr));
        System.out.println(findClosestNumber(arr1));
        System.out.println(findClosestNumber(arr2));
        System.out.println(findClosestNumber(arr3));
    }

    // Method --> 1
   /* public static int findClosestNumber(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int num=Math.abs(nums[i]);
            int temp=Math.abs(min);
            if(num<temp)
            {
                    min=nums[i];
            }
            if(num==temp && nums[i]>min)
            {
                min=nums[i];
            }
        }
        return min;
    }*/
    // Method --> 2
    public static int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int ans = 0, val = nums[0];
        for (int i : nums) {
            if (i == 0) return 0;
            if (i > 0) {
                ans = i;
                break;
            }
            val = i;
        }
        if (ans == 0) return nums[nums.length - 1];
        if (Math.abs(val) < ans) return val;
        return ans;
    }
}
