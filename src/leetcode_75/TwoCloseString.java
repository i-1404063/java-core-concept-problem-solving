package leetcode_75;

import java.util.HashMap;

public class TwoCloseString {

    static boolean twoCloseString(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        if (len1 != len2) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : word1.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (int i = 0; i < len1; i++) {

        }

    }

    public static void main(String... args) {
        String s1 = "abc";
        String s2 = "bca";
        System.out.println(twoCloseString(s1, s2));
    }
}
