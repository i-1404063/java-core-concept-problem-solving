package leetcode_75;

import java.util.*;;

public class PairOfSpellAndPotions {

    static int[] pairOfSpellAndPotions(int[] spells, int[] potions, long success) {

        int spellLen = spells.length;
        int potionLen = potions.length;
        Arrays.sort(potions);

        for (int i = 0; i < spellLen; i++) {
            long spell = spells[i];
            int low = 0, high = potionLen - 1, count = 0;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                long product = spell * potions[mid];

                if (product >= success) {
                    count = potionLen - mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            spells[i] = count;
        }

        return spells;

    }

    public static void main(String... args) {
        int[] spells = new int[] { 5, 1, 3 };
        int[] potions = new int[] { 1, 2, 3, 4, 5 };
        long success = 7;
        int[] result = pairOfSpellAndPotions(spells, potions, success);

        System.out.println(Arrays.toString(result));
    }
}
