package leetcode_75;

public class TripletSubsequence {

    static boolean tripletSubsequence(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return false;
        }

        int small = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;

        for (int n = 0; n < len; n++) {
            if (nums[n] <= small) {
                small = nums[n];
            }

            if (nums[n] > small && nums[n] <= mid) {
                mid = nums[n];
            }

            if (nums[n] > mid) {
                return true;
            }
        }
        return false;
    }

    public static void main(String... args) {

        int[] arr = new int[] { 20, 100, 10, 12, 5, 13 };
        System.out.println(tripletSubsequence(arr));
    }
}
