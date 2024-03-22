package leetcode_75;

public class FlowerBed {

    static boolean IsFlowerPlanted(int[] flowerBed, int plant) {
        int len = flowerBed.length;
        if (len == 0) {
            return false;
        }

        if (len == 1 && flowerBed[0] == 0) {
            return true;
        }

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (i == 0 && flowerBed[i] == 0 && flowerBed[i + 1] == 0) {
                count++;
                flowerBed[i] = 1;
            } else if (flowerBed[i] == 0 && flowerBed[i - 1] == 0) {
                if (i + 1 < len && flowerBed[i + 1] == 0) {
                    count++;
                    flowerBed[i] = 1;
                }

                if (i + 1 == len) {
                    count++;
                }
            }
        }

        return count >= plant ? true : false;

    }

    public static void main(String... args) {
        int[] flowerBed = new int[] { 0, 0 };
        int plant = 1;

        System.out.println(IsFlowerPlanted(flowerBed, plant));
    }
}
