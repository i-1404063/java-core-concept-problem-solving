package leetcode_75;

import java.util.*;

public class StringCompression {

    static int stringCompression(char[] str) {
        int len = str.length;
        char ch = str[0];
        int count = 1;
        int index = 0;

        for (int i = 1; i < len; i++) {
            if (str[i] == ch) {
                count++;
            } else {
                if (count > 1) {
                    str[index++] = ch;
                    if (count < 10) {
                        str[index++] = (char) (count + '0');
                    } else {
                        String number = String.valueOf(count);
                        for (int j = 0; j < number.length(); j++) {
                            str[index++] = number.charAt(j);
                        }
                    }
                } else {
                    str[index++] = ch;
                }
                ch = str[i];
                count = 1;
            }
        }

        if (count > 1) {
            str[index++] = ch;
            if (count < 10) {
                str[index++] = (char) (count + '0');
            } else {
                String number = String.valueOf(count);
                for (int j = 0; j < number.length(); j++) {
                    str[index++] = number.charAt(j);
                }
            }
        } else {
            str[index++] = ch;
        }

        return index;

        // String s = len1 > 1 ? "characters" : "character";
        // return "Return %d, and the first %d %s of the input array should be:
        // ".formatted(len1, len1, s)
        // + res.toString();

    }

    public static void main(String... args) {
        char[] chars = new char[] { 'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' };

        System.out.println(stringCompression(chars));
    }
}
