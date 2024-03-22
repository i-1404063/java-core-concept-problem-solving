package leetcode_75;

public class ReverseVowels {

    static String reverseVowels(String s) {
        int len = s.length();
        char[] charArr = new char[len];

        int i = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                charArr[i++] = ch;
            }
        }

        if (i == 0) {
            return s;
        }

        i -= 1;
        String result = "";

        for (int j = 0; j < len; j++) {
            char ch = s.charAt(j);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                result += charArr[i--];
            } else {
                result += ch;
            }
        }

        return result;

    }

    public static void main(String... args) {
        System.out.println(reverseVowels("leetcode"));
    }
}
