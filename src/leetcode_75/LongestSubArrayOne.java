package leetcode_75;

public class LongestSubArrayOne {

    static int longestSubArrayOne(int[] nums) {
        int len = nums.length;
        int left = 0, right = 0, windowCount = 0, maxCount = 0;
        while (right < len) {
            windowCount += nums[right];

            if (right - left + 1 - windowCount <= 1) {
                maxCount = Math.max(maxCount, right - left);
            } else {
                windowCount -= nums[left];
                left++;
            }

            right++;
        }

        return maxCount;
    }

    public static void main(String... args) {
        int[] nums = new int[] { 1, 1, 0, 1 };
        System.out.println(longestSubArrayOne(nums));
    }
}
