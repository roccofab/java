import java.io.*;
import java.util.ArrayList;

public class BookManagement {

    private ArrayList<Book> books;
    private String filename = "libraryData.txt";  // libraryData.txt file contain informations from input and it's in the same directory of the project BookStoreSystem

    public BookManagement() {
        this.books = new ArrayList<>();   //create new array list of books that will be used to manage the book store system
        loadBooks();
    }

    public void addBook(Book book) {
        books.add(book);
        saveBooks();
    }

    public void removeBook(String bookTitle) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getTitle().equals(bookTitle)) {
                bookToRemove = book;
                break;
            }
        }
            if (bookToRemove != null) {
                books.remove(bookToRemove);
                saveBooks();
            }
    }

    public void printBooks() {
        for (Book book : books) {  // print the list of books
            System.out.println(book.toString());
            System.out.println();
        }
    }
 public void deleteAllData() {
        books.clear();
        saveBooks();
 }
    public void loadBooks() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {  //load data in the filename using the object input stream
            Object obj = ois.readObject();
            if (obj instanceof ArrayList) {
                books = (ArrayList<Book>) obj;
            }
        } catch (IOException | ClassNotFoundException e) {
            // Ignore if the file does not exist or cannot be read
        }
    }

    public void saveBooks() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {  // Save data in the filename using the object output stream
            oos.writeObject(books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
