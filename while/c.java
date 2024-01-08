import java.util.Scanner;
public class c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] [] [] ticket = {
            {{"chicken breast", "7.00$", "1kg"}},
            {{"turkey", "7.99$", "1kg"}},
            {{"chicken", "8.99$", "1.5kg"}},
            {{"chicken wings", "6.0$", "0.750kg"}},
            {{"beef steak", "20.39$", "1kg"}},
            {{"beef slices", "12.50$", "1kg"}},
            {{"pork loin", "9.80$", "1kg"}},
            {{"pork sausages", "6.50$", "0.500kg"}},
            {{"bacon", "7.30$", "0.500kg"}},
            {{"roasts", "25$", "50pz."}},
            {{"lamb", "15.31$", "1kg"}},
            {{"rabbit", "12.50$", "1kg"}}  
        };
        boolean got = false;
        String price;
        String amount;
        for(String [] [] list : ticket) {
            String name = list [0] [0];
            price = list [0] [1];
            amount = list [0] [2];
            System.out.printlnl(name+ ":  " +price+ " for " +amount+ "\n");
        }
        double totalCost = 0.0;
        
        while (true) {
            System.out.println("Enter a product (or 'stop' to finish): ");
            String findP = input.nextLine();
            
            if (findP.equalsIgnoreCase("stop")) {
                break;
            }
        

       for(int i = 0; i < ticket.length; i++) {

        for (int j = 0; j < ticket[i].length; j++) {
        
            if(ticket[i] [j] [0].equalsIgnoreCase(findP)) {
            price = ticket [i] [j] [1];
            amount = ticket [i] [j] [2]; 
            got = true;
            System.out.println("\n\t\t The price for " + amount + " of " + findP + " is: " +price+ "\n");
           
       } 
    }
    }
     if(got == false) {
        System.out.println("\t\t\nUnstocked product...");
       } 
        }
    }
}
