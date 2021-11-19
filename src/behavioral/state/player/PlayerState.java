package behavioral.state.player;

public interface PlayerState {
    void setPlayer(AudioPlayer audioPlayer);
    void play();
    void pause();
    void stop();
    void next();
    void prev();
}
