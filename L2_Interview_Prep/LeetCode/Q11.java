package L2_Interview_Prep.LeetCode;

public class Q11 {
    public static void main(String[] args) {
    int[] arr={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }

    public static int maxArea(int[] nums) {
        int max = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int width = right - left;
            int height = Math.min(nums[left], nums[right]);
            max = Math.max(max, width * height);

            if (nums[left] < nums[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}