package co.edu.cue.stacksAndQueues.exercise2;

public class Book {
    private String name;
    private BookId id;

    public Book(String name, BookId id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookId getId() {
        return id;
    }

    public void setId(BookId id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return '{' +name+ ", " +id+ '}';
    }
}
