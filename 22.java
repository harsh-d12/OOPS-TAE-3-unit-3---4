class BankingSystem {
    private int accountBalance = 1000; // Shared balance

    // Method to withdraw money safely using synchronized block
    public void withdraw(String threadName, int amount) {
        synchronized (this) { // Only one thread can execute this at a time
            if (accountBalance >= amount) {
                System.out.println(threadName + " is withdrawing " + amount);
                accountBalance -= amount;
                System.out.println(threadName + " successfully withdrew " + amount);
                System.out.println("Remaining balance: " + accountBalance);
            } else {
                System.out.println(threadName + " failed to withdraw " + amount + ". Insufficient balance.");
            }
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Runnable for multiple threads
        Runnable task1 = () -> bank.withdraw("Thread-1", 700);
        Runnable task2 = () -> bank.withdraw("Thread-2", 500);

        // Create threads
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Start threads
        t1.start();
        t2.start();
    }
}
