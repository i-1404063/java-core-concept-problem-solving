package leetcode_75;

import java.util.*;

public class FindPeakElement {

    static int findPeakElement(int[] nums) {
        int beg, mid;
        int index = 0;

        beg = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > beg) {
                mid = nums[i];
                index = i;

                if (i + 1 < nums.length && nums[i + 1] < mid) {
                    return index;
                }
            }
        }

        return index;
    }

    public static void main(String... args) {
        int[] nums = new int[] { 1, 2, 1, 1, 1, 3, 5, 6, 4 };
        System.out.println(findPeakElement(nums));
    }
}
