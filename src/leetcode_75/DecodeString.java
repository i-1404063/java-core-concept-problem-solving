package leetcode_75;

import java.util.*;

public class DecodeString {

    static String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ret = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch != ']') {
                st.push(ch);
            } else {
                ret = new StringBuilder();
                while (!st.isEmpty() && Character.isLetter(st.peek())) {
                    ret.insert(0, st.pop());
                }
                st.pop();

                String timeSt = ret.toString();

                ret = new StringBuilder();
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    ret.insert(0, st.pop());
                }

                int times = Integer.valueOf(ret.toString());

                while (times-- > 0) {
                    for (char c : timeSt.toCharArray()) {
                        st.push(c);
                    }
                }

            }
        }

        ret = new StringBuilder();
        while (!st.isEmpty()) {
            ret.insert(0, st.pop());
        }

        return ret.toString();
    }

    public static void main(String... args) {
        String s = "a3[a2[c]]tt";
        System.out.println(decodeString(s));
    }
}
