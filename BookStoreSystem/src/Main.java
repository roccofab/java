import java.util.Locale;
import java.util.Scanner;

import static java.util.Scanner.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        BookManagement library = new BookManagement();
while(true) {
    System.out.println("1.Add Book(press 1): ");
    System.out.println("2.Remove Book( press 2): ");
    System.out.println("3.View List Books(press 3): ");
    System.out.println("4. Delete all Data(press 4): ");
    System.out.println(" 0.Exit(press 0): ");
    int choice = scanner.nextInt();
    scanner.nextLine();
    switch(choice) {
        case 1:
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Author: ");
            String author = scanner.nextLine();
            System.out.println("Price: ");
            double price = scanner.nextDouble();


            library.addBook(new Book(name, author, price));
            library.loadBooks();
            library.saveBooks();
            break;

        case 2:
            System.out.println("Enter name of the Book to Remove from the Library: ");
            String bookToRemove = scanner.nextLine();
            library.removeBook(bookToRemove);
            if (bookToRemove != null) {
                library.removeBook(bookToRemove);
                System.out.println("Book removed successfully.");
            } else {
                System.out.println("Book not found.");
            }
            library.loadBooks();
            library.saveBooks();
            break;

        case 3:
            library.printBooks();
            break;

        case 4:
            library.deleteAllData();
            break;

        case 0:
            System.out.println("Exiting the program. Goodbye!");
            System.exit(0);
            break;

     }
    }

    }
}