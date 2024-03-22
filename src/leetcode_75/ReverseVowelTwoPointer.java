package leetcode_75;

public class ReverseVowelTwoPointer {

    static String reverseVowels(String s) {
        boolean[] vowels = new boolean[128];
        for (char ch : "aeiouAEIOU".toCharArray()) {
            vowels[ch] = true;
        }

        int left = 0, right = s.length() - 1;
        char temp = 'a';
        char[] charArr = s.toCharArray();
        while (left < right) {
            while (left < right && !vowels[charArr[left]]) {
                left++;
            }

            while (left < right && !vowels[charArr[right]]) {
                right--;
            }

            temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
        return new String(charArr);
    }

    public static void main(String... args) {
        System.out.println(reverseVowels("hello"));
    }
}
