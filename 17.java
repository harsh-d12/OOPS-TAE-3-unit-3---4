class DownloadManager {

    // Inner class representing a file download task
    static class FileDownload implements Runnable {
        private String fileName;

        public FileDownload(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            System.out.println("Downloading " + fileName + "...");
            try {
                for (int i = 1; i <= 3; i++) {
                    Thread.sleep(1000); // simulate download progress
                    System.out.println(fileName + " Progress " + i);
                }
                System.out.println(fileName + " download completed.");
            } catch (InterruptedException e) {
                System.out.println(fileName + " download interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        // Create multiple download threads
        Thread t1 = new Thread(new FileDownload("File1.mp3"));
        Thread t2 = new Thread(new FileDownload("File2.mp4"));
        Thread t3 = new Thread(new FileDownload("File3.pdf"));

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
    }
}
