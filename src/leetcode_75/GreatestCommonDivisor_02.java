package leetcode_75;

public class GreatestCommonDivisor_02 {

    static String greatestCommonDivisor(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 == len2 && !str1.equals(str2)) {
            return "";
        }

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int max = 1;
        for (int i = 1; i <= len1 && i <= len2; i++) {
            if (len1 % i == 0 && len2 % i == 0) {
                max = i;
            }
        }

        return str1.substring(0, max);

    }

    public static void main(String... args) {
        String result = greatestCommonDivisor("TAUXXTAUXXTAUXXTAUXXTAUXX",
                "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX");
        System.out.println(result);
    }
}
