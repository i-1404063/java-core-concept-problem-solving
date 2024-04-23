package leetcode_75;

public class PivotIndex {

    static int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        prefix[0] = nums[0];

        int index = -1;

        for (int i = 1; i < len; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        for (int i = 0; i < len; i++) {
            if (i == 0) {
                if (prefix[len - 1] - prefix[0] == 0) {
                    index = 0;
                    return index;
                }
            } else {
                if (prefix[i - 1] == (prefix[len - 1] - prefix[i])) {
                    index = i;
                    return index;
                }
            }
        }

        return index;
    }

    public static void main(String... args) {
        int[] nums = new int[] { 2, 1, -1 };
        System.out.println(pivotIndex(nums));
    }
}
