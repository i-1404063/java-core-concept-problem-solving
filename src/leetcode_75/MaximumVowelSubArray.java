package leetcode_75;

public class MaximumVowelSubArray {

    static int maximumVowelSubArray(String s, int k) {
        int len = s.length();
        boolean[] vowelSet = new boolean[128];
        for (char ch : "aeiou".toCharArray()) {
            vowelSet[ch] = true;
        }

        int left = 0, right = k, windowVowelCount = 0, index = 0;
        while (index < k) {
            if (vowelSet[s.charAt(index)]) {
                windowVowelCount++;
            }

            ++index;
        }

        int maxVowel = windowVowelCount;
        while (right < len) {
            if (vowelSet[s.charAt(left)])
                windowVowelCount--;
            if (vowelSet[s.charAt(right)])
                windowVowelCount++;

            maxVowel = Math.max(maxVowel, windowVowelCount);
            right++;
            left++;
        }

        return maxVowel;
    }

    public static void main(String... args) {
        String s = "abciiidef";
        int k = 3;

        System.out.println(maximumVowelSubArray(s, k));
    }
}
