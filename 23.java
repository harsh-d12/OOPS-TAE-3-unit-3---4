class ChatApplication {

    // Thread to send messages
    static class Sender extends Thread {
        @Override
        public void run() {
            System.out.println("Sender thread started (NEW -> RUNNABLE)");
            for (int i = 1; i <= 3; i++) {
                System.out.println("Sending message " + i);
                try {
                    Thread.sleep(1000); // Simulate delay between messages
                } catch (InterruptedException e) {
                    System.out.println("Sender interrupted");
                }
            }
            System.out.println("Sender thread finished (TERMINATED)");
        }
    }

    // Thread to receive messages
    static class Receiver extends Thread {
        @Override
        public void run() {
            System.out.println("Receiver thread started (NEW -> RUNNABLE)");
            for (int i = 1; i <= 3; i++) {
                System.out.println("Receiving message " + i);
                try {
                    Thread.sleep(1500); // Simulate delay for receiving
                } catch (InterruptedException e) {
                    System.out.println("Receiver interrupted");
                }
            }
            System.out.println("Receiver thread finished (TERMINATED)");
        }
    }

    public static void main(String[] args) {
        Thread sender = new Sender();
        Thread receiver = new Receiver();

        System.out.println("Sender state: " + sender.getState());   // NEW
        System.out.println("Receiver state: " + receiver.getState()); // NEW

        sender.start();
        receiver.start();

        System.out.println("Sender state after start: " + sender.getState()); // RUNNABLE
        System.out.println("Receiver state after start: " + receiver.getState()); // RUNNABLE
    }
}
