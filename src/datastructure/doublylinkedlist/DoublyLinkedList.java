package datastructure.doublylinkedlist;

public class DoublyLinkedList {

    Node node, tail;

    void add(Book book, int userId) {
        if (node == null) {
            var newNode = new Node();
            newNode.setBook(book);
            newNode.setUserId(userId);
            node = newNode;
            tail = newNode;
        } else {
            var _node = new Node();
            _node.setBook(book);
            _node.setUserId(userId);
            if (node == tail) {
                tail = _node;
                node.next = tail;
                tail.prev = node;
            } else {
                _node.prev = tail;
                tail.next = _node;
                tail = _node;
            }
        }
    }

    void addFirst(Book book, int userId) {
        var newNode = new Node();
        newNode.setBook(book);
        newNode.setUserId(userId);

        if (node == null) {
            node = newNode;
            tail = newNode;
        } else {
            node.prev = newNode;
            newNode.next = node;
            node = newNode;
        }
    }

    void addAtPosition(int pos, Book book, int userId) {
        var _node = node;
        int count = 1;

        if (_node == null || pos <= 0)
            return;

        while (count != pos) {
            _node = _node.next;
            count++;
        }

        if (_node == null)
            return;

        var newNode = new Node();
        newNode.setBook(book);
        newNode.setUserId(userId);

        var prevNode = _node.prev;
        newNode.prev = prevNode;
        newNode.next = _node;
        prevNode.next = newNode;
        _node.prev = newNode;
    }

    boolean removeLastNode() {
        if (tail == null) {
            return false;
        }

        tail = tail.prev;
        tail.next = null;
        return true;
    }

    boolean removeFirstNode() {
        if (node == null) {
            return false;
        }

        node = node.next;
        node.prev = null;

        return true;
    }

    boolean removeAtPosition(int pos) {
        int count = 1;
        if (node == null) {
            return false;
        }

        var _node = node;
        while (count != pos) {
            if (_node == null)
                return false;
            _node = _node.next;
            count++;
        }

        _node.prev.next = _node.next;
        return true;
    }

    void printNodeList() {
        var _node = node;
        if (_node == null)
            return;
        while (_node.next != null) {
            System.out.println(_node.getBook().getName());
            _node = _node.next;
        }

        System.out.println(_node.getBook().getName());
    }

    void printReverseList() {
        var _node = tail;
        if (_node == null)
            return;
        while (_node.prev != null) {
            System.out.println(_node.getBook().getName());
            _node = _node.prev;
        }

        System.out.println(_node.getBook().getName());
    }

    public static void main(String... args) {
        var list = new DoublyLinkedList();
        list.add(new Book(1, "first-book", "author-1", "publisher-1"), 4);
        list.add(new Book(2, "second-book", "author-2", "publisher-2"), 4);

        list.add(new Book(3, "third-book", "author-3", "publisher-3"), 4);

        list.addFirst(new Book(3, "fourth-book", "author-4", "publisher-4"), 4);

        list.addAtPosition(2, new Book(5, "book-5", "author-5", "publisher-5"), 4);

        System.out.println("printing.........onward");
        list.printNodeList();

        System.out.println("printing.........backward");
        list.printReverseList();

        System.out.println("Removing from last.............");
        list.removeLastNode();
        list.printNodeList();

        System.out.println("Removing from beginning..............");
        list.removeFirstNode();
        list.printReverseList();

        System.out.println("Removing at position................");
        list.removeAtPosition(2);
        list.printNodeList();
    }

}
