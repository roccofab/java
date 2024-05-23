//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartPhone phone = new SmartPhone(17181234567L, 350162391280702L, "moto g84", "c8:9f:0c:28:13:a3");
        System.out.println("Switch on(press 1): ");
        System.out.println("Exit(press 0): ");
        int choice = sc.nextInt();
        int option;
        sc.nextLine();
        if (choice == 1) {
          do{
              System.out.println("\n\t1.Print Contacts(press 1): ");
              System.out.println("\t2.Send Message(press 2): ");
              System.out.println("\t3.Call Contact(press 3): ");
              System.out.println("\t4.Add Contact(press 4): ");
              System.out.println("\t5.Play Music(press 5): ");
              System.out.println("\t6.Play Video(press 6): ");
              System.out.println("\t7.Take Photo(press 7): ");
              System.out.println("\t8.Take Video(press 8): ");
              System.out.println("\t9.Print Gallery(press 9): ");
              System.out.println("\t10. Smartphone details(press 10): ");
              System.out.println("\t11.Add Sound(press 11): ");
              System.out.println("\t12.Print Playlist(press 12): ");
              System.out.println("\t0. Switch Off: ");
              option = sc.nextInt();
              switch(option) {
                  case 1:
                      phone.printContacts();
                      break;

                  case 2:
                      System.out.println("Enter Phone Number: ");
                      long phoneNo = sc.nextLong();
                      sc.nextLine();
                      System.out.println("Enter Message: ");
                      String message = sc.next();
                      phone.sendMessage(phoneNo, message);
                      break;

                  case 3:
                      System.out.println("Enter Phone Number: ");
                      phoneNo = sc.nextLong();
                      phone.callContact(phoneNo);
                      break;

                  case 4:
                      System.out.println("Enter Phone Number: ");
                      phoneNo = sc.nextLong();
                      System.out.println("Enter Name: ");
                      String name = sc.nextLine();
                      phone.addContact(new Contact(phoneNo, name));
                      break;

                  case 5:
                      phone.PlayMusic();
                      break;

                  case 6:
                      phone.PlayVideo();
                      break;

                  case 7:
                      phone.Click(null);
                      break;

                  case 8:
                      System.out.println("Enter Video Duration: ");
                      sc.nextLine();
                      String duration = sc.nextLine();
                      phone.capture(duration);
                      break;


                  case 9:
                      phone.printGallery();
                      break;

                  case 10:
                      phone.printInfo();
                      break;

                  case 11:
                      System.out.println("Enter Sound: ");
                      sc.nextLine();
                      String sound = sc.nextLine();
                      phone.addSound(new Playlist(sound));
                      break;

                  case 12:
                      phone.printPlayList();
                      break;



                  case 0:
                      System.out.println("Smartphone is off");
                      break;
              }
          } while(option != 0);
        } else if(choice == 0){
            System.exit(0);
        }

    }
}