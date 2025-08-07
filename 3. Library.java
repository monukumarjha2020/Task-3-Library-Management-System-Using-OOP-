import java.util.*;

public class Library {
    private Map<Integer, Book> books = new HashMap<>();
    private Map<Integer, User> users = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getId(), book);
        System.out.println("Book added: " + book);
    }

    public void addUser(User user) {
        users.put(user.getId(), user);
        System.out.println("User registered: " + user.getName());
    }

    public void listBooks() {
        System.out.println("Library Books:");
        for (Book book : books.values()) {
            System.out.println(" - " + book);
        }
    }

    public void borrowBook(int userId, int bookId) {
        User user = users.get(userId);
        Book book = books.get(bookId);

        if (user == null || book == null) {
            System.out.println("User or Book not found.");
            return;
        }

        if (book.isBorrowed()) {
            System.out.println("Book already borrowed.");
        } else {
            user.borrowBook(book);
            System.out.println(user.getName() + " borrowed " + book.getTitle());
        }
    }

    public void returnBook(int userId, int bookId) {
        User user = users.get(userId);
        Book book = books.get(bookId);

        if (user != null && book != null) {
            user.returnBook(book);
            System.out.println(user.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("User or Book not found.");
        }
    }
}
