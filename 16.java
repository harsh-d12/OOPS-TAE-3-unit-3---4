// MusicPlayer.java
class MusicPlayer extends Thread {

    @Override
    public void run() {
        System.out.println("Playing song...");
        try {
            for (int i = 1; i <= 3; i++) {
                Thread.sleep(1000); // Sleep for 1 second to simulate progress
                System.out.println("Progress " + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Playback interrupted");
        }
    }

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.start(); // Start the thread
    }
}v
