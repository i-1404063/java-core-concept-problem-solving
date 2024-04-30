package leetcode;

import java.util.*;

public class SubArrayDivisible {

    static int subArrayDivisible(int[] nums, int k) {
        Map<Integer, Integer> remainder = new HashMap<>();

        remainder.put(0, 1);

        int cumulativeSum = 0;
        int count = 0;

        for (int num : nums) {
            cumulativeSum += num;
            int rem = ((cumulativeSum % k) + k) % k;

            int complement = rem == 0 ? 0 : k - rem;

            count += remainder.getOrDefault(complement, 0);
            remainder.put(rem, remainder.getOrDefault(rem, 0) + 1);
        }

        return count;
    }

    public static void main(String... args) {
        int[] nums = new int[] { 4, 5, 0, -2, -3, 1 };
        int k = 5;
        System.out.println(subArrayDivisible(nums, k));
    }
}
