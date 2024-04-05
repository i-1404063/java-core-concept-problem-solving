package leetcode_75;

public class RemoveStars {

    static String removeStars(String s) {
        int len = s.length();

        if (len == 1 && s.charAt(0) == '*') {
            return "";
        }
        if (len == 1 && s.charAt(0) != '*') {
            return s;
        }

        var res = new StringBuilder();
        int right = 0;
        while (right < len) {
            while (s.charAt(right) != '*' && right < len - 1) {
                res.append(s.charAt(right));
                right++;
            }

            if (s.charAt(right) == '*') {
                int resLen = res.length();
                if (resLen >= 1) {
                    res.deleteCharAt(resLen - 1);
                }
                right++;
            } else {
                if (right == len - 1 && s.charAt(right) != '*') {
                    res.append(s.charAt(right));
                }
                right++;
            }
        }

        return res.toString();
    }

    public static void main(String... args) {
        String st = "*r";
        System.out.println(removeStars(st));
    }
}
