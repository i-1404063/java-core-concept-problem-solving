package leetcode_75;

import java.util.*;

public class DifferenceOfTwoArray {

    static List<List<Integer>> diffOfTwoArray(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        Set<Integer> list1 = new HashSet<>();
        Set<Integer> list2 = new HashSet<>();

        for (int item : nums1) {
            map1.put(item, 1);
        }

        for (int item : nums2) {
            map2.put(item, 2);
        }

        for (int item : nums2) {
            if (!map1.containsKey(item)) {
                list2.add(item);
            }
        }

        for (int item : nums1) {
            if (!map2.containsKey(item)) {
                list1.add(item);
            }
        }

        return List.of(new ArrayList<>(list1), new ArrayList<>(list2));

    }

    public static void main(String... args) {
        int[] nums1 = new int[] { 1, 2, 3 };
        int[] nums2 = new int[] { 2, 4, 6 };
        System.out.println(diffOfTwoArray(nums1, nums2));
        // diffOfTwoArray(nums1, nums2);
    }
}