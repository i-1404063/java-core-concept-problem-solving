package datastructure.singlylinkedlist;

public class Node {
    private Book book;
    private int userId;

    Node next;

    Node() {
        next = null;
    }

    void setBook(Book book) {
        this.book = book;
    }

    void setUserId(int id) {
        this.userId = id;
    }

    Book getBook() {
        return this.book;
    }

    int getUserId() {
        return this.userId;
    }
}
