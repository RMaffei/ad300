package mediaPlayer;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();
        StreamingPlayer streamingPlayer = new StreamingPlayer();

        // play each media player
        audioPlayer.play("Song - Wonderwall.mp3");
        videoPlayer.play("Movie - Lion_King.mp4");
        streamingPlayer.play("Live_Concert.mp4");

        // pause the players
        audioPlayer.pause();
        videoPlayer.pause();
        streamingPlayer.pause();

        // stop players
        audioPlayer.stop();
        videoPlayer.stop();
        streamingPlayer.stop();
    }
}
