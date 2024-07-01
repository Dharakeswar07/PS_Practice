package L2_Interview_Prep.blind_75;

public class Q153 {
    public static void main(String[] args) {
        int[] num={3,4,5,1,2};
        System.out.println(findMin(num));
    }
    public static int findMin(int[] nums) {
        // int min=nums[0];
        // for(int i:nums)
        // {
        //     if(i<=min)
        //     {
        //         min=i;
        //     }
        // }
        // return min;
        //     int min=nums[0];
        //    for(int i=0;i<nums.length-1;i++)
        //    {
        //     if(nums[i]>nums[i+1])
        //     {
        //         min=nums[i+1];
        //     }
        //    }
        //    return min;
        int left = 0;
        int right = nums.length - 1;
        if (nums[left] <= nums[right]) {
            return nums[left];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
