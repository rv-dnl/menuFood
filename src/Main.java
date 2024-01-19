import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int choice; // User's choice.
        double totalValue = 0; // Total order value.
        Scanner sc = new Scanner(System.in);

        // Displaying the menu.
        System.out.printf("%n<<MENU>>%n%n");
        System.out.println("0. Exit the menu");
        System.out.println("1. Hamburger - $5.00 ");
        System.out.println("2. Water - $1.00 ");
        System.out.println("3. Soda - $3.00 ");

        do {
            System.out.printf("%nEnter the number of the desired product: ");

            // User input for choice.
            choice = sc.nextInt();

            // Switch Case controlling the conditions.
            switch (choice) {
                case 0:
                    break;
                // Adding hamburger price to the total order value.
                case 1:
                    System.out.printf("%nHamburger - $5.00%n");
                    totalValue += 5;
                    break;
                // Adding water price to the total order value.
                case 2:
                    System.out.printf("%nWater - $1.00%n");
                    totalValue += 1;
                    break;
                // Adding soda price to the total order value.
                case 3:
                    System.out.printf("%nSoda - $3.00%n");
                    totalValue += 3;
                    break;
                // Invalid value.
                default:
                    System.out.printf("%nInvalid value!%n");
            }

        } while (choice != 0);
        // Displaying the final order total on the terminal.
        System.out.printf("%nTotal order value: $%.2f%n", totalValue);
    }
}
