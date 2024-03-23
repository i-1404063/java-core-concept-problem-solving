package leetcode_75;

public class MoveZeros {

    static void moveZeros(int[] nums) {
        int len = nums.length;
        int left = 0, right = len;

        while (left < right) {
            if (nums[left] == 0) {
                int l = left + 1;
                while (l < right && nums[l] == 0) {
                    l += 1;
                }
                if (l < right) {
                    int temp = nums[left];
                    nums[left] = nums[l];
                    nums[l] = temp;
                }
            }
            left++;
        }

    }

    public static void main(String... args) {
        int[] arr = new int[] { 0 };
        moveZeros(arr);
    }
}
