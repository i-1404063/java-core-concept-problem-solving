package leetcode_75;

public class MergeString_01 {

    public static void main(String... args) {
        String result = mergeStringAlternatively("ab", "pqrs");

        System.out.println(result);
    }

    static String mergeStringAlternatively(String s1, String s2) {
        StringBuilder mergeStr = new StringBuilder("");
        int len1 = s1.length();
        int len2 = s2.length();

        String leftover = "";
        int max = Math.min(len1, len2);
        if (len1 > len2) {
            leftover = s1.substring(len2);
        } else {
            leftover = s2.substring(len1);
        }

        for (int i = 0; i < max; i++) {
            mergeStr.append(s1.charAt(i));
            mergeStr.append(s2.charAt(i));
        }

        mergeStr.append(leftover);

        return mergeStr.toString();
    }
}
