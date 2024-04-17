package leetcode_75;

import java.util.*;

public class Dota2Senate {

    static String dota2Senate(String senate) {
        int len = senate.length();
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        for (int i = 0; i < len; i++) {
            if (senate.charAt(i) == 'R')
                radiant.offer(i);
            else
                dire.offer(i);
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int radiantIndex = radiant.poll();
            int direIndex = dire.poll();

            // if index is lesser means that party will ban other party so we have to keep
            // the party again in the respective queue
            if (radiantIndex < direIndex)
                radiant.offer(radiantIndex + len);
            else
                dire.offer(direIndex + len);
        }

        return radiant.isEmpty() ? "Dire" : "Radiant";
    }

    public static void main(String... args) {
        String s = "DRRDRDRDRDDRDRDR";
        System.out.println(dota2Senate(s));
    }
}
