package leetcode_75;

public class IsSubsequence {

    static boolean isSubsequence(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        if (len1 == 0 && len2 > 0) {
            return true;
        }

        if (len1 == 0 && len2 == 0) {
            return true;
        }

        if (len2 == 0) {
            return false;
        }

        int index = 0;
        int count = 0;
        char ch = s.charAt(index);
        for (int i = 0; i < len2; i++) {
            if (ch == t.charAt(i)) {
                count++;
                if (count == len1) {
                    return true;
                }
                ch = s.charAt(len1 - (len1 - (index + 1)));
                index++;
            }
        }

        return false;
    }

    public static void main(String... args) {
        String str = "ahbgdc";
        String str1 = "axc";
        System.out.println(isSubsequence(str1, str));
    }
}
