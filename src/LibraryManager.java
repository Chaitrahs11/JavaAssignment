import java.util.Scanner;

public class LibraryManager {
    private Library library = new Library();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n1. Add Book\n2. Remove Book\n3. Search Book\n4. List Books\n");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> removeBook();
                case 3 -> searchBook();
                case 4 -> listBook();
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private void addBook() {
        System.out.print("Enter type (book/ebook): ");
        String type = scanner.nextLine();

        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Available (true/false): ");
        boolean available = scanner.nextBoolean();
        int fileSize = 0;
        if (type.equalsIgnoreCase("ebook")) {
            System.out.print("File Size (MB): ");
            fileSize = scanner.nextInt();
            scanner.nextLine(); // consume newline
        }

        Book book = BookFactory.createBook(type, title, author, isbn, available, fileSize);
        library.addBook(book);
        System.out.println("Book added successfully.");


    }
    private void removeBook() {
        System.out.print("Enter ISBN to remove: ");
        String isbn = scanner.nextLine();
        boolean removed = library.removeBookByIsbn(isbn);
        if(removed){
            System.out.println("Book removed" );
        }
        else{
            System.out.println("Book not found" );
        }
    }

    private void searchBook() {
        System.out.print("Enter title to search: ");
        String title = scanner.nextLine();
        Book book = library.searchBookByTitle(title);
        if(book==null){
            System.out.println("book not found");
        }
        else{
            System.out.println(book);
        }
    }
    public void listBook(){
        library.getAllBook();

    }


}
