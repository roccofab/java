import java.io.*;
import java.util.ArrayList;
/**
 * The BookManagement class manages a collection of books using serialization for persistence.
 * It allows adding, removing, printing, and saving books to a file.
 * The data is stored and loaded from a file named "libraryData.txt".
 * This class assumes the existence of a Book class that implements Serializable.
 *
 */

public class BookManagement {

    private ArrayList<Book> books;
    private String filename = "libraryData.txt";  // libraryData.txt file contain informations from input and it's in the same directory of the project BookStoreSystem

    /**
     * Constructs a BookManagement object and loads existing books from the file.
     */
    public BookManagement() {
        this.books = new ArrayList<>();   //create new array list of books that will be used to manage the book store system
        loadBooks();
    }

    /**
     * Adds a new book to the collection and saves the updated list to the file.
     *
     * @param book the book to be added
     */
    public void addBook(Book book) {
        books.add(book);
        saveBooks();
    }

    /**
     * Removes a book from the collection based on its title and saves the updated list to the file.
     *
     * @param bookTitle the title of the book to be removed
     */
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

    /**
     * Prints the details of all books in the collection to the console.
     */
    public void printBooks() {
        for (Book book : books) {  // print the list of books
            System.out.println(book.toString());
            System.out.println();
        }
    }
    /**
     * Deletes all data by clearing the list of books and saving the empty list to the file.
     */
    public void deleteAllData() {
        books.clear();
        saveBooks();
 }
    /**
     * Loads books from the serialized file into the ArrayList.
     * Ignores exceptions if the file does not exist or cannot be read.
     */
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

    /**
     * Saves the current list of books to the file using serialization.
     * Prints the stack trace if an IOException occurs during serialization.
     */
    public void saveBooks() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {  // Save data in the filename using the object output stream
            oos.writeObject(books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
