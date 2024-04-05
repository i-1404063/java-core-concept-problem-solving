package leetcode_75;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OddEvenLinkedList {

    static ListNode oddEvenLinkedList(ListNode head) {
        int count = 1;
        var _node = head;
        if (_node == null)
            return head;

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        while (_node.next != null) {
            _node = _node.next;
            count++;
            if (count % 2 == 0) {
                odd.add(_node.val);
            } else {
                even.add(_node.val);
            }
        }

        List<Integer> mergeList = Stream.concat(even.stream(), odd.stream()).toList();
        var tempNode = head;
        for (int item : mergeList) {
            var newNode = new ListNode(item);
            tempNode.next = newNode;
            tempNode = tempNode.next;
        }

        return head;
    }

    public static void main(String... args) {
        ListNode head = new ListNode();
        System.out.println(oddEvenLinkedList(head));
    }
}
