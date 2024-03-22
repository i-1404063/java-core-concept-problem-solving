package leetcode;

public class GreatestCommonDivisor_01 {

    static int GreatestCommonDivisor(int[] nums) {
        int max = Integer.MIN_VALUE;
        int least = Integer.MAX_VALUE;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

            if (nums[i] < least) {
                least = nums[i];
            }
        }

        int gcd = 1;
        for (int j = 1; j <= least && j <= max; j++) {
            if (least % j == 0 && max % j == 0) {
                gcd = j;
            }
        }

        return gcd;
    }

    public static void main(String... args) {
        int[] arr = new int[] { 3, 3 };
        int result = GreatestCommonDivisor(arr);
        System.out.println("greatest common divisor==" + result);
    }
}
