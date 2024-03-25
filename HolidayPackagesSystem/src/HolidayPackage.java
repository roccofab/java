import java.util.ArrayList;

public class HolidayPackage {
    private String destination;
    private String description;
    private String price;

    public HolidayPackage(String destination, String description, String price) {  //constructor of the class HolidayPackage
        this.destination = destination;
        this.description = description;
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }
    public static void readPackages(ArrayList<HolidayPackage> holidayPackages) { //method to read packages from the list holidayPackages
        System.out.println("Available Holidays packages:");
        for (HolidayPackage pkg : holidayPackages) {
            System.out.println(pkg);
        }

    }

    public static void searchDestination(ArrayList<HolidayPackage> holidayPackages, String destination) {  //method to search a package by the value of the string destination from input user
        boolean found = false;
        for(HolidayPackage pkg : holidayPackages) {
            if(pkg.getDestination().equalsIgnoreCase(destination)) {
                System.out.println(pkg);
                found = true;
            }
        }
         if(!found) {
             System.out.println("Package Holiday not Available");
         }
    }

    private static int extractPrice(String priceString) {  //Extract the numeric price of the String price from input user
        String priceValue = priceString.replaceAll("\\D", ""); // Remove any not numeric digit
        return Integer.parseInt(priceValue);
    }

    public static void searchByPrice(ArrayList<HolidayPackage> holidayPackages, String targetPrice) {
        boolean found = false;
        for(HolidayPackage pkg : holidayPackages) {
            //extractPrice get the numeric value from pkg.getPrice and rom targetPrice and then compare the value of the price of HolidayPackage and the value of the price targetPrice from input user
            int price = extractPrice(pkg.getPrice());  //extract the numeric value from the string price of HoidayPackage
            int targetPriceValue = extractPrice(targetPrice);  //extract the numeric value of the targetPrice from input user
            //if the prices matches print the information about packages
            if(price == targetPriceValue) {
                System.out.println(pkg+ "\n");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No packages found for the price: " + targetPrice);
        }
    }

    @Override
    public String toString() {
        return "Destination: " + destination + " Description: " + description + " Price: " + price;
    }
}
