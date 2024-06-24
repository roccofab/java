import java.io.Serializable;

/**
 * The Book class represents a book with its title, author, and price.
 * It implements the Serializable interface to support object serialization.
 */

public class Book implements Serializable {
    private String title;
    private String author;
    private double price;

    static int numberBooks;
    /**
     * Constructs a Book object with the specified title, author, and price.
     *
     * @param title the title of the book
     * @param author the author of the book
     * @param price the price of the book
     */

    public Book(String title, String author, double price) {   // Book constructor
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    /**
     * Returns a string representation of the Book object.
     *
     * @return a string containing the title, author, and price of the book
     */

    @Override
    public String toString() {
        return "Book: " + title + "\nby " + author + "\nprice: " + price;
    }
}
