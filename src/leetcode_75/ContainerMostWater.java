package leetcode_75;

public class ContainerMostWater {

    static int containerMostWater(int[] height) {
        int len = height.length;

        int left = 0, right = len - 1;
        int max = Integer.MIN_VALUE;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            max = Math.max(minHeight * (right - left), max);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

    public static void main(String... args) {
        int[] arr = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(containerMostWater(arr));
    }
}
