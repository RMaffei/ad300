package mediaPlayer;

// StreamingPlayer.java
public class StreamingPlayer implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Now Streaming: " + fileName);
    }

    @Override
    public void pause() {
        System.out.println("Streaming has paused.");
    }

    @Override
    public void stop() {
        System.out.println("Streaming has stopped.");
    }
}