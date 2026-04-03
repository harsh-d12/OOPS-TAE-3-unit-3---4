import java.util.Scanner;
import java.util.InputMismatchException;

class StudentInputSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Accept student age
            System.out.print("Enter student age: ");
            int age = sc.nextInt();

            // Simple validation (optional logic to trigger ArithmeticException)
            int check = 100 / age;  // will throw exception if age = 0

            // Display valid age
            System.out.println("Student age is: " + age);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (ArithmeticException e) {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
