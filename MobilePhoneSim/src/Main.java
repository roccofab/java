import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        SIMcard simCard = null;
        SIMcard loadedSimCard = SIMcard.loadFile("dataCard.txt");  //load data from dataCard.txt using the method loadFile from the class SIMcard
        if (loadedSimCard != null) {
            simCard = loadedSimCard;
        }

        while(true) {
            System.out.println("\n");
            System.out.println("1.Create your New Number and then you Add your Recent Calls(press 1): ");
            System.out.println("2.Check the Minutes of Calls made(press 2): ");
            System.out.println("3.Search Number(press 3): ");
            System.out.println("4. Check sim card details(press 4): ");
            System.out.println("5. Add Recent Calls: ");
            System.out.println("6. Delete All SIM Card Data: ");
            System.out.println("0. Exit (press 0): ");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    //create a new object SIM card from the class SIMcard
                    System.out.println("Enter Phone Number(ex: +39 3427030458): ");
                    String number = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Enter the Recharged Money: ");
                    double availableCredit = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter name and surname: ");
                    String name = scanner.nextLine();
                    simCard = new SIMcard(number, availableCredit, new ArrayList<>(), name);  //parameters: phone number with a prefix, the recharged Credit and an empty list that will contain the recent calls
                    break;

                case 2:
                    //check the total minutes of calls using the method totalMinutesCalls() from the class SIMcard
                    if(simCard != null) {
                        int totalMinutes = simCard.totalMinutesCalls();
                        System.out.println("Total Minutes Calls: " +totalMinutes);
                    }else {
                            System.out.println("No Sim Found");
                    }
                        break;

                case 3:
                    //count how many calls to/from an input number using the method countCallsToNumber
                    if(simCard != null) {
                        System.out.println("Enter number to Search: ");
                        scanner.nextLine();
                        String numberToSearch = scanner.nextLine();
                        int counter = simCard.countCallsToNumber(numberToSearch);
                        System.out.println("You Called Number: " +numberToSearch+ " for " +counter+ " Times ");
                    } else {
                        System.out.println("No Sim Found");
                    }
                    break;

                case 4:
                    //check the details of the number phone using the method printCalls() of the class SIMcard
                    if(simCard != null) {
                        simCard.printCalls();
                    }
                    break;

                case 5:
                    //add recent calls using the method addRecentCalls of the class SIMcard, enter exit for startTime or endTime  to stop
                   while(true) {
                       System.out.println("\t\t\n Add a call:".toUpperCase());
                       System.out.println("Enter Start Time(exit to stop): ");
                       String startTime = scanner.next();
                       scanner.nextLine();
                       if (startTime.equalsIgnoreCase("exit")) {
                           break;
                       }
                       System.out.println("Enter end Time(exit to stop): ");
                       String endTime = scanner.next();
                       scanner.nextLine();
                       if (endTime.equalsIgnoreCase("exit")) {
                           break;
                       }
                       System.out.println("Enter target phone number: ");
                       String targetPhoneNumber = scanner.nextLine();
                       simCard.addRecentCall(startTime, endTime, targetPhoneNumber);  //call has three attributes: start time(ex: 18:00), endTime(ex: 18:20) and a targetPhoneNumber with a prefix
                   }
                    break;

                case 6:
                    //delete all data from the file dataCard.txt using the method deleteFile() of the class SIMcard
                    if(simCard != null) {
                        simCard.deleteFile("dataCard.txt");
                        simCard = new SIMcard("", 0, new ArrayList<>(), "");  //once you've deleted data you create a new object SIMcard with empty attributes
                    }
                    break;
                case 0:
                    //exit
                    System.exit(0);
            }
            simCard.saveToFile("dataCard.txt");
        }
    }
}