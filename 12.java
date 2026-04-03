import java.util.Scanner;

class DivisionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Accept two integers from user
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Perform division
            int result = num1 / num2;

            // Display result
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Cannot divide by zero");
        }

        sc.close();
    }
}
