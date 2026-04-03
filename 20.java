class ThreadPrioritySystem {

    // Thread class to display messages
    static class MyThread extends Thread {
        private String name;

        public MyThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println(name + " executing step " + i);
                try {
                    Thread.sleep(500); // Simulate work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1"); // Low priority
        MyThread t2 = new MyThread("Thread-2"); // High priority
        MyThread t3 = new MyThread("Thread-3"); // Normal priority

        // Set thread priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.MAX_PRIORITY);   // 10
        t3.setPriority(Thread.NORM_PRIORITY);  // 5

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
