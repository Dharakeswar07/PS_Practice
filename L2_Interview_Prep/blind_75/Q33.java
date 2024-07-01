package L2_Interview_Prep.blind_75;

public class Q33 {
    public static void main(String[] args) {
        int[] num={4,5,6,7,0,1,2,3};
        int target=0;
        System.out.println(search(num,target));
    }
    public  static int search(int[] nums, int target) {
        /*int count=0;
        for(int i:nums)
        {
            if(i==target)
            {
                return count;
            }
            count++;
        }
        return -1;*/


        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;                 }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;

    }
}
