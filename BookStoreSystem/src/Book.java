import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String author;
    private double price;

    static int numberBooks;

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

    @Override
    public String toString() {
        return "Book: " + title + "\nby " + author + "\nprice: " + price;
    }
}
