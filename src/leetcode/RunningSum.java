package leetcode;

import java.util.Arrays;

public class RunningSum {

    static int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] runSum = new int[len];

        runSum[0] = nums[0];
        for (int i = 1; i < len; i++) {
            runSum[i] = nums[i] + runSum[i - 1];
        }

        return runSum;
    }

    public static void main(String... args) {
        int[] arr = new int[] { 1, 1, 1, 1, 1 };
        System.out.println(Arrays.toString(runningSum(arr)));
    }
}
