public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isBorrowed = false;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isBorrowed() { return isBorrowed; }

    public void borrow() { isBorrowed = true; }
    public void returnBook() { isBorrowed = false; }

    @Override
    public String toString() {
        return id + ": " + title + " by " + author + (isBorrowed ? " (Borrowed)" : "");
    }
}
