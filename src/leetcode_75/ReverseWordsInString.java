package leetcode_75;

public class ReverseWordsInString {

    static String reverseWordsInString(String s) {
        String trimmedStr = s.trim();
        StringBuilder res = new StringBuilder();
        boolean flag = false, firstWord = true;
        String temp = "";
        int index = 0;
        char[] charArr = trimmedStr.toCharArray();
        int len = charArr.length;
        for (int i = len - 1; i >= 0; i--) {
            char ch = charArr[i];
            index++;
            if (ch == ' ') {
                if (!flag) {
                    flag = true;
                }
                continue;
            } else {
                if (flag) {
                    if (firstWord) {
                        res.append(temp);
                        firstWord = false;
                    } else {
                        res.append(" " + temp);
                    }
                    temp = "";
                    flag = false;
                }

                temp = ch + temp;
                if (index == len) {
                    if (firstWord) {
                        res.append(temp);
                    } else {
                        res.append(" " + temp);
                    }
                }
            }
        }

        return res.toString();
    }

    public static void main(String... args) {
        String str = "  hello world  ";
        System.out.println(reverseWordsInString(str));
    }
}
