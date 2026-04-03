import java.util.Scanner;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept password from the user
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Mask all characters except last two
        if (password.length() > 2) {
            String maskedPart = password.substring(0, password.length() - 2)
                                        .replaceAll(".", "*");
            String visiblePart = password.substring(password.length() - 2);

            String maskedPassword = maskedPart + visiblePart;

            // Display masked password
            System.out.println("Masked Password: " + maskedPassword);
        } else {
            // If password length is 2 or less, show as it is
            System.out.println("Masked Password: " + password);
        }

        sc.close();
    }
}
