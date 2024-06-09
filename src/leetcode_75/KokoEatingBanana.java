package leetcode_75;

public class KokoEatingBanana {

    static int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;

        for (int val : piles) {
            high = Math.max(val, high);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            int speed = 0;
            for (int val : piles) {
                if (val % mid > 0) {
                    speed += (val / mid) + 1;
                } else {
                    speed += (val / mid);
                }
            }

            if (speed <= h) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return high;
    }

    public static void main(String... args) {
        int[] piles = new int[] { 805306368, 805306368, 805306368 };
        int h = 1000000000;

        System.out.println(minEatingSpeed(piles, h));
    }
}
