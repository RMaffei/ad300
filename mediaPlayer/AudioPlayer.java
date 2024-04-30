package mediaPlayer;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing track: " + fileName);
    }

    @Override
    public void pause() {
        System.out.println("Audio player has paused.");
    }

    @Override
    public void stop() {
        System.out.println("Audio player has stopped.");
    }
}