import java.util.Scanner;

// ALIMENTS MENU --- JAVA KNOWLEDGE //
// I've kept it simple with only 3 products for better understanding. //

public class Main {

    public static void main(String[] args) {

        int escolha; // User's choice.
        double valorTotal = 0; // Total order value.
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Displaying the menu.
            System.out.printf("%n<<MENU>>%n%n");
            System.out.println("0. Exit the menu");
            System.out.println("1. Hamburger - $5.00 ");
            System.out.println("2. Water - $1.00 ");
            System.out.println("3. Soda - $3.00 ");
            System.out.printf("%nEnter the number of the desired product: ");

            // User input for choice.
            escolha = sc.nextInt();

            // Switch Case controlling the conditions.
            switch (escolha) {
                case 0:
                    break;
                // Adding hamburger price to the total order value.
                case 1:
                    System.out.printf("%nHamburger - $5.00%n");
                    valorTotal = valorTotal + 5;
                    break;
                // Adding water price to the total order value.
                case 2:
                    System.out.printf("%nWater - $1.00%n");
                    valorTotal = valorTotal + 1;
                    break;
                // Adding soda price to the total order value.
                case 3:
                    System.out.printf("%nSoda - $3.00%n");
                    valorTotal = valorTotal + 3;
                    break;
                // Invalid value.
                default:
                    System.out.printf("%nInvalid value!%n");
                    break;
            }
            // Condition to break the loop.
            if (escolha == 0) {
                break;
            }
        }
        // Displaying the final order total on the terminal.
        System.out.printf("%nTotal order value: $%.2f%n", valorTotal);
    }
}
