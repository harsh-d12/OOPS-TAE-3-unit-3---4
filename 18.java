class RailwayReservation {
    private int availableTickets = 1; // Only 1 ticket available for demonstration

    // Synchronized method to book ticket
    public synchronized void bookTicket(String passengerName) {
        if (availableTickets > 0) {
            System.out.println(passengerName + " is booking ticket...");
            try {
                Thread.sleep(1000); // Simulate processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            availableTickets--;
            System.out.println("Ticket booked successfully for " + passengerName);
        } else {
            System.out.println("No tickets available for " + passengerName);
        }
    }

    public static void main(String[] args) {
        RailwayReservation reservation = new RailwayReservation();

        // Two passengers trying to book at the same time
        Thread t1 = new Thread(() -> reservation.bookTicket("Alice"));
        Thread t2 = new Thread(() -> reservation.bookTicket("Bob"));

        t1.start();
        t2.start();
    }
}
