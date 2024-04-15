package leetcode_75;

import java.util.*;
import java.util.stream.Collectors;

public class RowColumnPair {

    static int rowColumnPair(int[][] grid) {
        int len = grid.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (map.containsKey(j)) {
                    var list = map.get(j);
                    list.add(grid[i][j]);
                    map.put(j, list);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(grid[i][j]);
                    map.put(j, list);
                }
            }
        }

        int pairs = 0;
        for (int i = 0; i < len; i++) {
            var col = Arrays.stream(grid[i]).mapToObj(Integer::valueOf).collect(Collectors.toList());

            pairs += Collections.frequency(map.values(), col);
        }

        return pairs;
    }

    public static void main(String... args) {
        int[][] arr = new int[][] {
                { 3, 1, 2, 2 },
                { 1, 4, 4, 4 },
                { 2, 4, 2, 2 },
                { 2, 5, 2, 2 }
        };

        System.out.println(rowColumnPair(arr));
    }
}
