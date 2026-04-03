import java.util.Scanner;

class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Accept account balance
            System.out.print("Enter account balance: ");
            double balance = sc.nextDouble();

            // Accept withdrawal amount
            System.out.print("Enter withdrawal amount: ");
            double withdrawAmount = sc.nextDouble();

            // Check condition and throw exception manually
            if (withdrawAmount > balance) {
                throw new Exception("Insufficient Balance");
            }

            // Deduct amount and display updated balance
            balance -= withdrawAmount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
