package leetcode;

public class RangeSumQuery {
    int[] prefix;

    public RangeSumQuery(int[] nums) {
        this.prefix = new int[nums.length];

        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        if (left >= 1) {
            return prefix[right] - prefix[left - 1];
        }

        return prefix[right];
    }
}
