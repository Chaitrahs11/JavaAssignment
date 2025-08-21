import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books = new ArrayList<>();

    public boolean addBook(Book book) {

        return books.add(book);
    }

    public boolean removeBookByIsbn(String isbn) {

        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                return true;
            }

        }
        return false;
    }

    public Book searchBookByTitle(String title){
        for(Book book:books){
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }

    public void getAllBook(){
        if(books.isEmpty()){
            System.out.println("no books available");
        }
        else{
            for(Book book:books){
                System.out.println(book);
            }
        }
    }
}
