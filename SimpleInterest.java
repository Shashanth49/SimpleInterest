import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input: Principal amount
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        // Input: Rate of interest
        System.out.print("Enter the Rate of interest (in %): ");
        double rate = scanner.nextDouble();

        // Input: Time period in years
        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        // Calculation: Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Output: Display the result
        System.out.println("The Simple Interest is: " + simpleInterest);

        // Close the scanner
        scanner.close();
    }
}

