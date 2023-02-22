fgpackage provider;

import java.util.Scanner;

public class Provider {

    public static void main(String[] args) {
        
        
        // Scanner to read from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Market Name:");
        String marketname = input.next();
        Market market = new Market(marketname);
        String check = "yes";
        
        //while loop to enter all the items wanted
        while("Yes".equalsIgnoreCase(check)){
            
            //enter item information
            System.out.print("Enter item Catagory: ");
            String catagory = input.next();
            
            
            System.out.print("Enter item name: ");
            String name = input.next();
            
            
            System.out.print("Enter item price: ");
            double price = input.nextDouble();
            
            
            System.out.print("Enter item monthly Earnings: ");
            int earnings = input.nextInt();
            
            
            System.out.println("Do you want to add another item? (Yes\\No):");
            check = input.next();
            
            //creating new object for the target item
            itemEarning item = new itemEarning(earnings, catagory, name, price);
            
            // adding the item in the market list
            market.Additem(item);
        }
        
        // method to print all the items in the market
        market.itemsinfo();
        
        // method to print the item of the month 
        System.out.println("\n");
        market.itemsofthemonths();
    }
    
}
