
class Restaurant {
    private boolean foodReady = false; // Shared resource

    // Chef thread (Producer)
    class Chef extends Thread {
        @Override
        public void run() {
            synchronized (Restaurant.this) {
                try {
                    System.out.println("Chef is preparing food...");
                    Thread.sleep(1000); // Simulate food preparation
                    foodReady = true;
                    System.out.println("Chef prepared food");
                    Restaurant.this.notify(); // Notify waiter
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Waiter thread (Consumer)
    class Waiter extends Thread {
        @Override
        public void run() {
            synchronized (Restaurant.this) {
                try {
                    while (!foodReady) {
                        Restaurant.this.wait(); // Wait for food
                    }
                    System.out.println("Waiter served food");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Waiter waiter = restaurant.new Waiter();
        Chef chef = restaurant.new Chef();

        waiter.start(); // Waiter waits for food
        chef.start();   // Chef prepares food
    }
}
