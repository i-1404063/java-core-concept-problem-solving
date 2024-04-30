package leetcode_75;

import java.util.*;

public class TwoCloseString {

    static boolean twoCloseString(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        if (len1 != len2) {
            return false;
        }

        Set<Character> set = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char ch : word1.toCharArray()) {
            set.add(ch);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char ch : word2.toCharArray()) {
            set2.add(ch);
            if (map2.containsKey(ch)) {
                map2.put(ch, map2.get(ch) + 1);
            } else {
                map2.put(ch, 1);
            }
        }

        if (!set.equals(set2)) {
            return false;
        }

        for (int val : map2.values()) {
            if (map.values().contains(val)) {
                map.values().remove(val);
            } else {
                return false;
            }
        }

        return true;

    }

    public static void main(String... args) {
        String s1 = "aaabbbbccddeeeeefffff";
        String s2 = "aaaaabbcccdddeeeeffff";
        System.out.println(twoCloseString(s1, s2));
    }
}
