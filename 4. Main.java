import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Sample Data
        library.addBook(new Book(1, "Java Basics", "James Gosling"));
        library.addBook(new Book(2, "Spring in Action", "Craig Walls"));

        library.addUser(new User(1, "Alice"));
        library.addUser(new User(2, "Bob"));

        // Menu loop
        while (true) {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. List Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> library.listBooks();
                case 2 -> {
                    System.out.print("User ID: ");
                    int uid = sc.nextInt();
                    System.out.print("Book ID: ");
                    int bid = sc.nextInt();
                    library.borrowBook(uid, bid);
                }
                case 3 -> {
                    System.out.print("User ID: ");
                    int uid = sc.nextInt();
                    System.out.print("Book ID: ");
                    int bid = sc.nextInt();
                    library.returnBook(uid, bid);
                }
                case 4 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
