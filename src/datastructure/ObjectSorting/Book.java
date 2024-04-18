package datastructure.ObjectSorting;

public class Book {
    private int id;
    private String name;
    private String writer;

    public Book(int id, String name, String writer) {
        this.id = id;
        this.name = name;
        this.writer = writer;
    }

    public int getBookId() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
