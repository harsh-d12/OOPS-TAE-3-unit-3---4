class OnlineShoppingSystem {

    // Thread for processing payment
    static class PaymentThread extends Thread {
        @Override
        public void run() {
            System.out.println("Processing payment...");
            try {
                Thread.sleep(1000); // Simulate payment processing time
            } catch (InterruptedException e) {
                System.out.println("Payment interrupted");
            }
        }
    }

    // Thread for processing order
    static class OrderThread extends Thread {
        @Override
        public void run() {
            System.out.println("Order confirmed...");
        }
    }

    public static void main(String[] args) {
        // Create threads
        Thread payment = new PaymentThread();
        Thread order = new OrderThread();

        // Start threads
        payment.start();
        try {
            payment.join(); // Ensure payment completes before order confirmation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        order.start();
    }
}
