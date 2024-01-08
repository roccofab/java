import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          String [] city = {"milan", "rome", "milan", "rome", "turin", "milan", "turin", "rome", "genova", "naples", "rome", "genova", "naples", "padova", "naples", "salerno", "florence", "naples", "milan", "rome", "salerno", "florence", "padova", "milan", "florence", "rome", "genova", "milan", "padova"};
         int occurences = 0;

         System.out.println("\nEnter italian city's name: ");
         String findCity = input.nextLine();

         for(String search : city) {
            if(search.equalsIgnoreCase(findCity)) {
            occurences++;
            }
         }
         System.out.println("\t" +findCity+ " is stored " +occurences+ " times ");
    }
}