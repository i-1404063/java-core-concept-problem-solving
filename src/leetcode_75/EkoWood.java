package leetcode_75;

public class EkoWood {

    static boolean isSufficientWood(int[] trees, int h, long mid) {
        long wood = 0;
        for (int val : trees) {
            if (val > mid) {
                wood += (val - mid);
            }
        }

        if (wood >= h)
            return true;

        return false;
    }

    static int maxHeight(int[] trees, int h) {
        int mid, low = 0;
        long high = 1000000000L;

        while (high - low > 1) {
            mid = (int) (low + high) / 2;
            if (isSufficientWood(trees, h, mid)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }

        if (isSufficientWood(trees, h, high)) {
            return (int) high;
        } else {
            return low;
        }
    }

    public static void main(String... args) {
        int[] trees = new int[] { 4, 42, 40, 26, 46 };
        int h = 20;

        System.out.println(maxHeight(trees, h));
    }
}
