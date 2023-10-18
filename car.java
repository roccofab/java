import java.util.Scanner;

public class car {
    public static void printCars(String[][][] carArray) {
        for (String[][] carInfo : carArray) {
            String nameC = carInfo[0][0];
            String carburant = carInfo[0][1];
            String distance = carInfo[0][2];
            System.out.println("\n\t" +nameC + "  ||  " +carburant+ "--" +distance+ "\n");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][][] vk = {
            {{"volkswagen polo", "10.00l", "70km"}},
            {{"volkswagen golf", "10.0l", "50km"}},
            {{"volkswagen passat", "10.0l", "50km"}},
            {{"volkswagen golf GTI", "10.0l", "30km"}}
        };
        String [] [] [] au = {
            {{"audi a1", "10.0l", "70km"}},
            {{"audi a3", "10.0l", "50km"}},
            {{"audi a4", "10.0l", "40km"}},
            {{"audi q5", "10.0l", "40km"}},
            {{"audi q7", "10.0l", "30km"}}
        };
        String [] [] [] fi = {
            {{"fiat panda", "10.0l", "80km"}}, 
            {{"fiat punto", "10.0l", "70km"}},
            {{"fiat 500", "10.0l", "70km"}}
        };
          String nameC ;
          String carburant;
          String distance;

        System.out.println("\n\nEnter car (choose volkswagen, audi or fiat): ");
        String type = input.nextLine().toLowerCase();

        switch(type) {
            case "volkswagen":
            printCars(vk);
            System.out.println("70$ - 1 Day || 1770 $ - 1 Month || 9075$ - 1 Year (SUPER PRICE!!)\n\n");
            break;

            case "audi":
            printCars(au);
            System.out.println("70$ - 1 Day || 1770$ - 1 Month || 9075$ - 1 Year (SUPER PRICE!!)\n\n");
            break;

            case "fiat":
            printCars(fi);
            System.out.println("50$ - 1 Day || 1020$ - 1 Month || 7260$ - 1 Year (SUPER PRICE!!)\n\n");
            break;

            default:
            System.out.println("Not Available");
        }
        System.out.println("Enter your choice: ");
        String choice = input.nextLine();

        if(choice.contains("volkswagen")) {
            System.out.println("\n\nRental Time (enter number days): ");
            int rentalTimeV = input.nextInt();
            if(rentalTimeV >= 1 && rentalTimeV < 30) {
                rentalTimeV *= 100;
                System.out.println(rentalTimeV+ " $");
             } else if(rentalTimeV >= 30 && rentalTimeV < 363) {
                rentalTimeV *= 59;
                System.out.println(rentalTimeV+ " $");
            } else {
                rentalTimeV *= 25;
                System.out.println(rentalTimeV+ " $");
            }


        } else if(choice.contains("audi")) {
            System.out.println("\n\nRental Time (enter number days): ");
            int rentalTimeA = input.nextInt();
            if(rentalTimeA >= 1 && rentalTimeA < 30 ) {
                rentalTimeA *= 100;
                System.out.println(rentalTimeA+ " $");
            } else if(rentalTimeA >= 30 && rentalTimeA < 363) {
                rentalTimeA *= 59;
                System.out.println(rentalTimeA+ " $");
            } else {
                rentalTimeA *= 25;
                System.out.println(rentalTimeA+ " $");
            }


        } else if(choice.contains("fiat")) {
            System.out.println("\n\nRental Time(enter number days)");
            int rentalTimeF = input.nextInt();
            if(rentalTimeF >= 1 && rentalTimeF < 30) {
                rentalTimeF *= 70;
                System.out.println(rentalTimeF+ " $");
            } else if(rentalTimeF >= 30 && rentalTimeF < 363) {
                rentalTimeF *= 34;
                System.out.println(rentalTimeF+ " $");
            } else {
                rentalTimeF *= 20;
                System.out.println(rentalTimeF+ " $");
            }
        }
    }
}