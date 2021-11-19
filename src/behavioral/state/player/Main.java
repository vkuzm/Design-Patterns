package behavioral.state.player;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> playlist = Arrays.asList("Song 1", "Song 2", "Song 3");

        AudioPlayer audioPlayer = new AudioPlayer(playlist);
        audioPlayer.setState(new OnStopState());

        // STOP state
        audioPlayer.getState().stop();
        audioPlayer.getState().play();

        // PLAY state
        audioPlayer.getState().next();
        audioPlayer.getState().next();
        audioPlayer.getState().prev();
        audioPlayer.getState().pause();

        audioPlayer.getState().pause();
        audioPlayer.getState().stop();
        audioPlayer.getState().play();
    }

}
