package leetcode_75;

import java.util.*;

public class UniqueOccurence {

    static boolean uniqueOccurence(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int item : arr) {
            if (!map.containsKey(item)) {
                map.put(item, 1);
            } else {
                map.put(item, map.get(item) + 1);
            }
        }

        Set<Integer> values = new HashSet<>(map.values());
        if (values.size() == map.size()) {
            return true;
        }
        return false;
    }

    public static void main(String... args) {

    }
}
