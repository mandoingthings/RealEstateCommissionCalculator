import java.util.Scanner;

public class RealEstateCommissionCalculator {

    public static void main(String[] args) {
        System.out.println("Welcome to the Real Estate Commission Calculator!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter your county (Miami Dade or Palm Beach): ");
        String userCounty = scanner.nextLine();

        if (userCounty.equalsIgnoreCase("Miami Dade") || userCounty.equalsIgnoreCase("Palm Beach")) {
            double commissionRate = (userCounty.equalsIgnoreCase("Miami Dade")) ? 0.052 : 0.057;

            System.out.print("Enter the purchase price: ");
            double purchasePrice = scanner.nextDouble();

            double commissionAmount = purchasePrice * commissionRate;

            System.out.println("Hello, " + userName + "!");
            System.out.println("Commission for " + userCounty + " county is: $" + commissionAmount);

        } else {
            System.out.println("The app only covers Miami Dade or Palm Beach counties.");

            System.out.print("Would you like to retype the county name? (YES/NO): ");
            String retryInput = scanner.next();

            if (retryInput.equalsIgnoreCase("YES")) {
                main(args);
            } else {
                System.out.println("Program ended. Thank you!");
            }
        }

        scanner.close();
    }
}
