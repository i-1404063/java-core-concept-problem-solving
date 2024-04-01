package datastructure.doublylinkedlist;

public class Node {

    private Book book;
    private int userId;

    Node prev, next;

    Node() {
        prev = null;
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
