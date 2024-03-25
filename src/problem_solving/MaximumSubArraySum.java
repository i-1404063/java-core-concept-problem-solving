package problem_solving;

public class MaximumSubArraySum {

    static int maximumSubArraySum(int[] arr, int k) {
        int len = arr.length;
        int left = 0, right = k, index = 0, windosum = 0;
        while (index < k) {
            windosum += arr[index];
            ++index;
        }

        int maxSum = windosum;
        while (right < len) {
            windosum += arr[right] - arr[left];
            maxSum = Math.max(maxSum, windosum);
            right++;
            left++;
        }

        return maxSum;
    }

    public static void main(String... args) {
        int[] arr = new int[] { 1006, 7800, 300, 7000, 12000, 2000 };
        int k = 2;
        System.out.println(maximumSubArraySum(arr, k));
    }
}
