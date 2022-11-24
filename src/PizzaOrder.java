/**
 * Kadek Narayana 60092
 * All Task Lab 3
 * Created on Tuesday, 18 October 2022
 * 08.00AM-09.23AM
 */

import java.util.Scanner;  // Needed for the Scanner class

public class PizzaOrder {
    /**
     * This program allows the user to order a pizza.
     */

    public static void main(String[] args) {
        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        String firstName;             // User's first name
        boolean discount = false;     // Flag for discount
        int inches;                   // Size of the pizza;
        char crustType;               // For type of crust
        String crust = "Hand-Tossed"; // Name of crust
        double cost = 12.99;              // Cost of the pizza
        double PizzaAkhir;           // Price The Pizza After Topping
        final double TAX_RATE = .08;  // Sales tax rate
        double tax;                   // Amount of tax
        char choice;                  // User's choice
        String input;                 // User input
        String toppings = "Cheese ";  // List of toppings
        int numberOfToppings = 0;     // Number of toppings
        String firstName1;             // to convert the name to uppercase
        double toppingTotal;             //Total Toping Price

        // Prompt user and get first name.
        System.out.println("Welcome to Mike and " +
                "Diane's Pizza");
        System.out.print("Enter your first name: ");
        firstName = keyboard.nextLine();
        firstName1= firstName.toUpperCase();
        // Determine if user is eligible for discount by
        // having the same first name as one of the owners.
        if(firstName1.equals("MIKE") ||firstName1.equals("DIANE"))
        {
            System.out.println("Congratulations You Got Discount $2 Because you have same name with owner");
            discount=true;
        }
            // ADD LINES HERE FOR TASK #1

            // Prompt user and get pizza size choice.
            System.out.println("Pizza Size (inches)   Cost");
            System.out.println("        10            $10.99");
            System.out.println("        12            $12.99");
            System.out.println("        14            $14.99");
            System.out.println("        16            $16.99");
            System.out.println("What size pizza " +
                    "would you like?");
            System.out.print("10, 12, 14, or 16 " +
                    "(enter the number only): ");
            inches = keyboard.nextInt();
            //this operation for determine the pizza cost
        if(inches==10)
        {
            cost-=2;
        } else if (inches==12) {
            cost*=1;
        } else if (inches==14) {
            cost+=2;
        } else if (inches==16) {
            cost+=4;
        }
        else
        {
            System.out.println("you will get 12 inches if you input wrong size");
        }
        /** we can create this with switch case and I create the switch
         * statement here

        switch (inches) {
            case 10 -> cost -= 2;
            case 12 -> cost *= 1;
            case 14 -> cost += 2;
            case 16 -> cost += 4;
            default -> System.out.println("you will get 12 inches if you input wrong size");
        }
         */

            // Set cost and size of pizza ordered.
            // ADD LINES HERE FOR TASK #2

            // Consume the remaining newline character.
            keyboard.nextLine();

            // Prompt user and get crust choice.
            System.out.println("What type of crust " +
                    "do you want? ");
            System.out.print("(H)Hand-tossed, " +
                    "(T) Thin-crust, or " +
                    "(D) Deep-dish " +
                    "(enter H, T, or D): ");
            input = keyboard.nextLine();
            crustType = input.charAt(0);
            crustType= Character.toUpperCase(crustType);

            //this is for determine crust kind of crust type the customer want
            switch (crustType)
            {
                case 'H' -> crust = "Hand-tossed";
                case 'T' -> crust = "Thin-Crust";
                case 'D' -> crust = "Deep-Dish";
                default -> System.out.println("you will automatically get Hand-tossed if wrong input");
            }
            // Set user's crust choice on pizza ordered.
            // ADD LINES FOR TASK #3

            // Prompt user and get topping choices one at a time.
            System.out.println("All pizzas come with cheese.");
            System.out.println("Additional toppings are " +
                    "$1.25 each, choose from:");
            System.out.println("Pepperoni, Sausage, " +
                    "Onion, Mushroom");

            // If topping is desired,
            // add to topping list and number of toppings
            System.out.print("Do you want Pepperoni? (Y/N): ");
            input = keyboard.nextLine();
            choice = input.charAt(0);
            if (choice == 'Y' || choice == 'y') {
                numberOfToppings += 1;
                toppings = toppings + "Pepperoni ";
            }
            System.out.print("Do you want Sausage? (Y/N): ");
            input = keyboard.nextLine();
            choice = input.charAt(0);
            if (choice == 'Y' || choice == 'y') {
                numberOfToppings += 1;
                toppings = toppings + "Sausage ";
            }
            System.out.print("Do you want Onion? (Y/N): ");
            input = keyboard.nextLine();
            choice = input.charAt(0);
            if (choice == 'Y' || choice == 'y') {
                numberOfToppings += 1;
                toppings = toppings + "Onion ";
            }
            System.out.print("Do you want Mushroom? (Y/N): ");
            input = keyboard.nextLine();
            choice = input.charAt(0);
            if (choice == 'Y' || choice == 'y') {
                numberOfToppings += 1;
                toppings = toppings + "Mushroom ";
            }

            // Add additional toppings cost to cost of pizza.
            toppingTotal=1.25 * numberOfToppings;
            // Applying Discount
            if(discount)
            {
                PizzaAkhir=cost + toppingTotal-2;
            } else {
                PizzaAkhir = cost + toppingTotal;
            }

        // Display order confirmation.
            System.out.println();
            System.out.println("Your order is as follows: ");
            System.out.println(inches + " inch pizza");
            System.out.println(crust + " crust");
            System.out.println(toppings);

            // Apply discount if user is eligible.
            // ADD LINES FOR TASK #4 HERE

            // EDIT PROGRAM FOR TASK #5
            // SO ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES
            System.out.printf("your Pizza Order "+ "is $%.2f and your topping " +
                    "is: $%.2f\n", cost,toppingTotal);
            System.out.printf("Your Total Without Tax is $%.2f\n",PizzaAkhir);

            // Calculate and display tax and total cost.
            tax = PizzaAkhir * TAX_RATE;
            System.out.printf("The tax is: $%.2f\n", tax);
            System.out.printf("The total due is: $%.2f\n",
                    (tax + PizzaAkhir));

            System.out.printf("Thank you for Your order %s it will be ready " +
                    "for pickup in 30 minutes.", firstName1);
        }
    }


