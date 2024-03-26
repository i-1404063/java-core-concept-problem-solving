package leetcode_75;

public class MaxConsecutiveOnes {

    static int maxConsecutiveOnes(int[] nums, int k) {
        int len = nums.length;
        int left = 0, right = 0;
        int maxCount = 0;
        int windowCount = 0;

        while (right < len) {

            windowCount += nums[right];

            if (right - left + 1 - windowCount <= k) {
                maxCount = Math.max(maxCount, right - left + 1);
            } else {
                windowCount -= nums[left];
                left++;
            }

            right++;

        }

        return maxCount;
    }

    public static void main(String... args) {
        int[] arr = new int[] { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        System.out.println(maxConsecutiveOnes(arr, k));
    }
}
