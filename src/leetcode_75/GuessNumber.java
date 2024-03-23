package leetcode_75;

public class GuessNumber {

    static int guessNumber(int n) {
        int low = 0, high = n, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (guess(mid, n) == 0)
                return mid;
            else if (guess(mid, n) == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return mid;
    }

    static int guess(int num, int n) {
        int pick = n / 2;
        if (num > pick) {
            return -1;
        }

        if (num < pick) {
            return 1;
        }

        return 0;
    }

    public static void main(String... args) {
        guessNumber(10);
    }
}
