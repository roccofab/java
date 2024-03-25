import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <HolidayPackage> holidayPackages = new ArrayList<>();  //list of objects HolidayPackage with attribute destination, description and price
        holidayPackages.add(new HolidayPackage(
                "London",
                "\nThis tour includes departure by Plane, You can Depart from the Italian Airport of your Choice. Hotel Stay included.  Duration Travel: 5 Days.  Tour Guide Included.",
                "\n2000€ per Person"
        ));
        System.out.println();

        holidayPackages.add(new HolidayPackage(
                "Rome",
                "This tour include departure by Bus from any City in Italy. \nHotel Stay Included. \n Duration Travel: 3 Days. \n Tour Guide Included.\n",
                "1000€ per Person"
        ));
        System.out.println();

        holidayPackages.add(new HolidayPackage(
                "Paris",
                "\nThis tour include departure by Plane. \nHotel Stay Included. \n Duration Travel: 3 Days. \nTour Guide Included.\n",
                "1500€ per Person"
        ));
        System.out.println();

        holidayPackages.add(new HolidayPackage(
                "Egypt",
                "\nThis tour includes departure by Plane, You can Depart from the Italian Airport of your Choice. \nHotel Stay included. \n Duration Travel: 5 Days. \n Tour Guide Included.\n",
                "2000€ per Person"

        ));
        System.out.println();

        holidayPackages.add(new HolidayPackage(
                "Amsterdam",
                "\nThis tour includes departure by Plane, You can Depart from the Italian Airport of your Choice. \nHotel Stay included. \n Duration Travel: 5 Days. \n Tour Guide Included.\n",
                "2000€ per Person"
        ));

        holidayPackages.add(new HolidayPackage(
                "Barcelona",
                "\nThis tour includes departure by Plane, You can Depart from the Italian Airport of your Choice. \nHotel Stay included. \n Duration Travel: 7 Days. \n Tour Guide Included.\n",
                "2500€ per Person"
        ));

        holidayPackages.add(new HolidayPackage(
                "Switzerland",
                "\nThis tour includes departure by Plane, You can Depart from the Italian Airport of your Choice. \nHotel Stay included. \n Duration Travel: 5 Days. \n Tour Guide Included.\n",
                "3000€ per Person"
        ));

        holidayPackages.add(new HolidayPackage(
                "Germany",
                "\nThis tour includes departure by Plane, You can Depart from the Italian Airport of your Choice. \nHotel Stay included. \n Duration Travel: 7 Days. \n Tour Guide Included.\n",
                "4000€ per Person"
        ));

        holidayPackages.add(new HolidayPackage(
                "Russia",
                "\nThis tour includes departure by Plane, You can Depart from the Italian Airport of your Choice. \nHotel Stay included. \n Duration Travel: 7 Days. \n Tour Guide Included.\n",
                "3000€ per Person"
        ));

        holidayPackages.add(new HolidayPackage(
                "Miami",
                "\nThis tour includes departure by Plane, You can Depart from the Italian Airport of your Choice. \nHotel Stay included. \n Duration Travel: 7 Days. \n Tour Guide Included.\n",
                "4500€ per Person"
        ));
        holidayPackages.add(new HolidayPackage(
                "America",
                "\nThis tour includes departure by Plane, You can Depart from the Italian Airport of your Choice. \nHotel Stay included. \n Duration Travel: 14 Days. \n Tour Guide Included.\n",
                "7500€ per Person"
        ));

        holidayPackages.add(new HolidayPackage(
                "Poland",
                "\nThis tour includes departure by Plane, You can Depart from the Italian Airport of your Choice. \nHotel Stay included. \n Duration Travel: 7 Days. \n Tour Guide Included.\n",
                "3000€ per Person"
        ));

        holidayPackages.add(new HolidayPackage(
                "China",
                "\nThis tour includes departure by Plane, You can Depart from the Italian Airport of your Choice. \nHotel Stay included. \n Duration Travel: 10 Days. \n Tour Guide Included.\n",
                "4000€ per Person"
        ));

        ArrayList<Booking> bookings = new ArrayList<>();  //List of bookings you can add a new booking to the list by pressing 4
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Read available holiday Packages(press 1): ");
            System.out.println("2. Search for a Destination(press 2): ");
            System.out.println("3. Search for a Destination by Price(press 3): ");
            System.out.println("4. Book Holiday Package(press 4): ");
            System.out.println("0. Exit(press 0): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    HolidayPackage.readPackages(holidayPackages);  //print available packages using the method readPackages from the class HolidayPackage
                    break;

                case 2:
                    System.out.println("Search for a Destination: ");  //search for a destination using the method searchDestination from the class HolidayPackage
                    String destination = sc.nextLine().trim();
                    HolidayPackage.searchDestination(holidayPackages, destination);
                    break;

                case 3:
                    System.out.println("Search fo Destinations by Price: ");  //search for a destination by price using the method searchByPrice and extractPrice from the class HolidayPackage
                    String targetPrice = sc.nextLine();
                    HolidayPackage.searchByPrice(holidayPackages, targetPrice);
                    break;

                case 4:
                    System.out.println("Make a Booking:");
                    System.out.println("Enter Destination: ");
                    String bookingDestination = sc.nextLine().trim();

                    boolean destinationFound = false;  //check if the input destination exists
                    for(HolidayPackage pkg : holidayPackages) {
                        if(pkg.getDestination().equalsIgnoreCase(bookingDestination)) {
                            destinationFound = true;  //available input destination
                            break;
                        }
                    }
                    if(!destinationFound) {
                        System.out.println("Destination not Found");
                        break;
                    }
                    //enter the attributes for the new object Booking
                    System.out.println("Enter Customer Name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Number of Persons: ");
                    int numberPersons = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Booking Date(ex: 5 September 2025): ");
                    String date = sc.nextLine();

                    //Find the holiday package corresponding to your destination
                    HolidayPackage selectedPackage = null;
                    for (HolidayPackage pkg : holidayPackages) {
                        if (pkg.getDestination().equalsIgnoreCase(bookingDestination)) {
                            selectedPackage = pkg;
                            break;
                        }
                    }

                    //create object Booking
                    Booking booking = new Booking(selectedPackage, name, numberPersons, date);
                    bookings.add(booking);
                    System.out.println("Booking Successfully Created");
                    break;

                case 0:
                    System.exit(0);
                    break;
            }
        } while(true);  //enter 0 to make the condition false

    }
}