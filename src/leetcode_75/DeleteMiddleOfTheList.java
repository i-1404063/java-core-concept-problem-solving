package leetcode_75;

public class DeleteMiddleOfTheList {

    static ListNode deleteMiddleOfTheList(ListNode head) {
        int count = 1;
        var _node = head;
        while (_node.next != null) {
            _node = _node.next;
            count++;
        }

        if (count <= 1)
            return head.next;
        int mid = count / 2, start = 0;
        var tmpNode = head;
        ListNode prevNode = new ListNode();

        while (start < mid) {
            prevNode = tmpNode;
            tmpNode = tmpNode.next;
            start++;
        }

        prevNode.next = tmpNode.next;

        return head;
    }

    public static void main(String... args) {
        var head = new ListNode();
        System.out.println(deleteMiddleOfTheList(head));
    }
}
