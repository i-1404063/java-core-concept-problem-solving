package datastructure.ObjectSorting;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {
        return b1.getBookId() - b2.getBookId();
    }

    public static void main(String... args) {
        Book[] books = new Book[] {
                new Book(3,
                        "book-3", "writer-3"),
                new Book(1, "book-1", "writer-1"),
                new Book(0, "book", "writer")
        };

        Arrays.sort(books, new Sorting());

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
