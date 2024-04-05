package datastructure.circularlinkedlist;

public class CircularLinkedList {

    Node head, tail;

    void add(Book book, int userId) {
        var node = new Node();
        node.setBook(book);
        node.setUserId(userId);

        if (head == null) {
            head = node;
            tail = node;
            head.prev = tail;
            head.next = tail;
            tail.prev = head;
            tail.next = head;
        } else {
            if(head == tail) {

            } else {
                
            }
        }
    }

    public static void main(String... args) {

    }
}
