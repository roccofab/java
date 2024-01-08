import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][][] ticket = {
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

            boolean found = false;
            String price = "";
            String amount = "";

        for(String [] [] list : ticket) {
            String name = list [0] [0];
            price = list [0] [1];
            amount = list [0] [2];
            System.out.println(name+ ":  " +price+ " for " +amount+ "\n");
        }
        
        double totalCost = 0.0;
        double payment = 0.0;
        
        while (true) {
            System.out.println("Enter a product (or 'stop' to finish): ");
            String findP = input.nextLine();
            
            if (findP.equalsIgnoreCase("stop")) {
               System.out.println("\n\nTotal cost for the products added: $" + totalCost);
               System.out.println("\nEnter money to pay: ");
               payment = input.nextDouble();
               payment -= totalCost;
               System.out.println("\nYour oddment is: " +payment);
                break;
                
            }
            
          
            
            for (String[][] c : ticket) {
                String name = c[0][0];
                price = c[0][1];
                amount = c[0][2];
                if (name.equalsIgnoreCase(findP)) {
                    found = true;
                    break;
                }
            }
            
            if (found) {
                System.out.println("Enter amount(kg or gr): ");
                String inputAmount = input.next();

                double quantityGrams = 0.0;
                if(inputAmount.endsWith("kg")) {
                    quantityGrams = Double.parseDouble(inputAmount.replace("kg", "")) * 1000;
                } else if(inputAmount.endsWith("g")) {
                    quantityGrams = Double.parseDouble(inputAmount.replace("g", "inputAmount"));
                }
                double productPriceg = Double.parseDouble(price.replace("$", "")) / 1000;
                double totalPrice = quantityGrams * productPriceg;

                totalCost += Double.parseDouble(price.replace("$",""));
                System.out.println("The price for " +inputAmount+ " of " +findP+ " is " +totalPrice+ " \n\n");
            } else {
                System.out.println("Unstocked product...\n\n");
            }
        }
        
       
    }
}
