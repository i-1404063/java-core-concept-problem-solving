package leetcode_75;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RecentCounter {

    Queue<Integer> recentCalls;

    public RecentCounter() {
        this.recentCalls = new LinkedList<>();
    }

    public int ping(int t) {
        this.recentCalls.add(t);
        int rangeSt = t - 3000;

        while (recentCalls.peek() < rangeSt) {
            recentCalls.remove();
        }

        return recentCalls.size();
    }

    public static void main(String... args) {
        var recentCounter = new RecentCounter();
        int[] calls = new int[] { 1, 100, 3001, 3002 };
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < calls.length; i++) {
            list.add(recentCounter.ping(calls[i]));
        }

        System.out.println(list);
    }
}
