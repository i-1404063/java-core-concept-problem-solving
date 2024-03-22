package datastructure;

;

public class SecondMax {
    int max = Integer.MIN_VALUE;
    int secMax = 0;

    public int secondMax(int[] arr, int n, int i) {
        if (i == n) {
            return secMax;
        }

        if (arr[i] > max) {
            secMax = max;
            max = arr[i];
        }

        if (arr[i] > secMax && arr[i] < max) {
            secMax = arr[i];
        }

        return secondMax(arr, n, i + 1);
    }

    public static void main(String... args) {
        SecondMax main = new SecondMax();
        int[] myarr = new int[] { 4, 12, 5, 2, 3, 10, 1, 8, 9, 13, 87 };
        int result = main.secondMax(myarr, myarr.length, 0);
        System.out.println("second max = " + result);
    }
}
