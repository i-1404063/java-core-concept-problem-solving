package datastructure.singlylinkedlist;

public class SinglyLinkedList {

    Node node;

    void add(Book book, int userId) {
        if (node == null) {
            node = new Node();
            node.setBook(book);
            node.setUserId(userId);
        } else {
            Node tempNode = node, newNode = new Node();
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }

            newNode.setBook(book);
            newNode.setUserId(userId);
            tempNode.next = newNode;
        }
    }

    void atFirst(Book book, int userId) {
        Node newNode = new Node();
        newNode.setBook(book);
        newNode.setUserId(userId);

        if (node == null) {
            node = newNode;
        } else {
            newNode.next = node;
            node = newNode;
        }
    }

    boolean adPosition(int pos, Book book, int userId) {
        var _node = node;
        int count = 1;

        if (_node == null) {
            return false;
        }

        while (_node != null) {
            if (pos == count) {
                Node newNode = new Node(), tempNode;

                tempNode = _node;
                newNode.setBook(tempNode.getBook());
                newNode.setUserId(tempNode.getUserId());

                _node.setBook(book);
                _node.setUserId(userId);
                newNode.next = tempNode.next;
                _node.next = newNode;
                return true;
            } else {
                count++;
                _node = _node.next;
            }
        }

        return false;
    }

    void printNodeList() {
        Node _node = node;
        if (_node == null) {
            return;
        }

        while (_node.next != null) {
            System.out.println(_node.getBook().getName());
            _node = _node.next;
        }

        System.out.println(_node.getBook().getName());
    }

    public static void main(String... args) {
        var list = new SinglyLinkedList();
        list.add(new Book(1, "Pirates of the caribbean", "cristofer noman",
                "r.k-studio"), 4);

        list.add(new Book(2, "Harry potter", "j.k rowling", "Cosmic"), 5);

        list.printNodeList();

        System.out.println("------------------------");

        list.atFirst(new Book(3, "book-3", "author-3", "publiser-3"), 4);
        list.adPosition(2, new Book(5, "book-4", "author-4", "publisher-4"), 4);

        list.printNodeList();
    }
}
