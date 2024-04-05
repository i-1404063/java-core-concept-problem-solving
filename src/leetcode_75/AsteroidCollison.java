package leetcode_75;

import java.util.*;

import java.util.*;;

public class AsteroidCollison {

    static int[] asteroidCollision(int[] asteroids) {
        int len = asteroids.length;

        Stack<Integer> stack = new Stack<>();
        for (int item : asteroids) {
            stack.push(item);
        }

        int left = len - 2, right = len - 1;
        while (right >= 1 && left >= 0) {

            int rightAst = (int) stack.elementAt(right);
            int leftAst = (int) stack.elementAt(left);

            if (rightAst < 0 && leftAst > 0) {
                if (-rightAst > leftAst) {
                    stack.remove(left);
                } else if (leftAst > -rightAst) {
                    stack.remove(right);
                } else {
                    int i = 0;
                    while (i < 2) {
                        stack.remove(right - i);
                        i++;
                    }
                }
                int stackLen = stack.size();
                right = stackLen - 1;
                left = stackLen - 2;

            } else {
                left--;
                right--;
            }

        }

        int[] resArr = new int[stack.size()];
        for (int i = resArr.length - 1; i >= 0; i--) {
            resArr[i] = stack.pop();
        }

        return resArr;
    }

    public static void main(String... args) {
        int[] nums = new int[] { 10, 2, -5 };
        asteroidCollision(nums);
    }
}
