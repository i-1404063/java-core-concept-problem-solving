package leetcode_75;

import java.util.HashMap;

public class KSumPairs {

    static int kSumPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int left = 0, right = len - 1;
        int pairs = 0;
        while (left < right) {
            int complement = k - nums[left];
            if (map.containsKey(complement) && map.get(complement) >= 1) {
                int complementVal = map.get(complement);
                int numVal = map.get(nums[left]);
                if (complement == nums[left]) {
                    if (complementVal > 1) {
                        pairs++;
                        map.put(complement, complementVal - 2);
                    }
                } else if (numVal > 0) {
                    pairs++;
                    map.put(complement, complementVal - 1);
                    map.put(nums[left], numVal - 1);
                }
            }

            left++;
        }

        return pairs;
    }

    public static void main(String... args) {
        int[] arr = new int[] { 3, 1, 3, 4, 3 };
        System.out.println(kSumPairs(arr, 6));
    }
}
