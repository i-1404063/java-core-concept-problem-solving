package leetcode_75;

import java.util.*;

public class KidWithGreatestCandy {

    static List<Boolean> GreatestCandy(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandy = Integer.MIN_VALUE;
        int candyLen = candies.length;

        for (int i = 0; i < candyLen; i++) {
            if (candies[i] > maxCandy) {
                maxCandy = candies[i];
            }
        }

        for (int i = 0; i < candyLen; i++) {
            if (candies[i] + extraCandies >= maxCandy) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String... args) {
        int[] candies = new int[] { 4, 2, 1, 1, 2 };
        int extraCandy = 1;
        System.out.println(GreatestCandy(candies, extraCandy));
    }
}
