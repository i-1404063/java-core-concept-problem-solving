package leetcode_75;

import java.util.*;

public class ProductArray {

    static int[] productArray(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int zeros = 0;
        int product = 1;

        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                zeros++;
            } else
                product *= nums[i];
        }

        if (zeros == 1) {
            for (int i = 0; i < len; i++) {
                if (nums[i] == 0) {
                    ans[i] = product;
                }
            }
        } else if (zeros == 0) {
            for (int i = 0; i < len; i++) {
                ans[i] = product / nums[i];
            }
        }

        return ans;
    }

    public static void main(String... args) {
        int[] arr = new int[] { -1, 1, 0, -3, 0 };
        System.out.println(Arrays.toString(productArray(arr)));
    }
}
