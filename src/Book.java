public class Book implements Comparable<Book> {

    private Integer id;
    private String name;
    private String writer;

    public Book(int id, String name, String writer) {
        this.id = id;
        this.name = name;
        this.writer = writer;
    }

    public int compareTo(Book b) {
        if (id > b.id) {
            return 1;
        } else if (id < b.id) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return this.name + " " + this.writer;
    }

}
