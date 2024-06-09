package leetcode_75;

public class KthLargetElement {

    static int[] divideAndConquer(int[] arr, int mid) {
        int[] finalArr = new int[arr.length];

    }

    static int largestElem(int[] nums, int k) {
        int mid = nums.length / 2;

        if (mid > 2) {
            divideAndConquer(nums, mid);
        } else if (mid == 2) {
            int temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;

            return nums[k];
        } else {
            return nums[k];
        }
    }

    public static void main(String... args) {

    }
}
