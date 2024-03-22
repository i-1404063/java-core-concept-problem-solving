package leetcode;

import java.util.*;

public class PairSum {

    static boolean pairSum(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            int sub = target - nums[i];
            if (map.containsKey(sub)) {
                return true;
            } else {
                map.put(nums[i], nums[i]);
            }
        }

        return false;
    }

    public static void main(String... args) {

        int[] arr = new int[] { 20, 100, 10, 12, 5, 13 };
        System.out.println(pairSum(arr, 117));
    }
}
