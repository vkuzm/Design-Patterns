package behavioral.state;

import java.util.List;

public class AudioPlayer {
    private List<String> playlist;
    private PlayerState state;
    private int currentTrack = 0;

    public AudioPlayer(List<String> playlist) {
        this.playlist = playlist;
    }

    public PlayerState getState() {
        return state;
    }

    public void setState(PlayerState state) {
        this.state = state;
        this.state.setPlayer(this);
    }

    public void startPlayback() {
        System.out.println("Playing " + playlist.get(currentTrack));
    }

    public void nextTrack() {
        currentTrack++;
        if (currentTrack > playlist.size() - 1) {
            currentTrack = 0;
        }

        System.out.println("Playing " + playlist.get(currentTrack));
    }

    public void previousTrack() {
        currentTrack--;
        if (currentTrack < 0) {
            currentTrack = playlist.size() - 1;
        }

        System.out.println("Playing " + playlist.get(currentTrack));
    }
}
