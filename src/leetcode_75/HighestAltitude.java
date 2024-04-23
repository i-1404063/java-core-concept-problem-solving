package leetcode_75;

public class HighestAltitude {

    static int highestAltitude(int[] gain) {
        int len = gain.length;
        int[] prefix = new int[len];

        prefix[0] = gain[0];
        int highestGain = gain[0];

        for (int i = 1; i < len; i++) {
            prefix[i] = gain[i] + prefix[i - 1];
            if (prefix[i] > highestGain) {
                highestGain = prefix[i];
            }
        }

        return highestGain < 0 ? 0 : highestGain;
    }

    public static void main(String... args) {
        int[] nums = new int[] { 52, -91, 72 };
        System.out.println(highestAltitude(nums));
    }
}
