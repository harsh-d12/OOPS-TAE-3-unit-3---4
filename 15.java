// BankApplication.java
class BankApplication {

    // Method that may throw an exception
    void processTransaction(boolean simulateError) throws Exception {
        if (simulateError) {
            throw new Exception("Transaction failed!");
        } else {
            System.out.println("Transaction processed");
        }
    }

    public static void main(String[] args) {
        BankApplication app = new BankApplication();

        try {
            // Change to true to simulate an exception
            app.processTransaction(false);  
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}
