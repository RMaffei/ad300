package mediaPlayer;

public class VideoPlayer implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing video: " + fileName);
    }

    @Override
    public void pause() {
        System.out.println("Video player has paused.");
    }

    @Override
    public void stop() {
        System.out.println("Video player has stopped.");
    }
}