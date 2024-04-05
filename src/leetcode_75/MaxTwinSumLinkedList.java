package leetcode_75;

import java.util.*;

public class MaxTwinSumLinkedList {

    static int maxTwinSumLinkedList(ListNode head) {
        int count = 1;
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        var _node = head;
        list.add(_node.val);
        while (_node.next != null) {
            _node = _node.next;
            count++;
            list.add(_node.val);
        }

        int mid = count / 2, start = 0, end = count - 1, sum = 0;
        while (start < mid && end >= mid) {
            sum += list.get(start) + list.get(end);
            max = Math.max(max, sum);
            sum = 0;
            start++;
            end--;
        }

        return max;
    }

    public static void main(String... args) {

        ListNode head = new ListNode();
        System.out.println(maxTwinSumLinkedList(head));
    }
}
