package leetcode_75;

public class MaximumAverageSubarray {

    static double maximumAverageSubarray(int[] arr, int k) {

        int len = arr.length;
        int left = 0, right = k, index = 0;
        double windowSum = 0.0;

        while (index < k) {
            windowSum += arr[index];
            ++index;
        }

        double maxSum = windowSum;

        while (right < len) {
            windowSum += arr[right] - arr[left];
            maxSum = Math.max(maxSum, windowSum);
            right++;
            left++;
        }

        return maxSum / k;
    }

    public static void main(String... args) {
        int[] arr = new int[] { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        System.out.println(maximumAverageSubarray(arr, k));
    }
}
