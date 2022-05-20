package exercise2.biblioteca.pilas;

public class Book {

    private BookType bookType;
    private String name;

    public Book() {
    }

    public Book(BookType bookType, String name) {
        this.bookType = bookType;
        this.name = name;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "---Book---  " +
                "bookType=" + bookType +
                ", name='" + name + '\'';
    }
}
