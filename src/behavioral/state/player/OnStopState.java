package behavioral.state.player;

public class OnStopState implements PlayerState {

    private AudioPlayer audioPlayer;

    {
        System.out.println("STATUS: Music is stopped");
    }

    @Override
    public void setPlayer(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void play() {
        audioPlayer.setState(new OnPlayState());
        audioPlayer.startPlayback();
    }

    @Override
    public void pause() {
        System.out.println("Locket...");
    }

    @Override
    public void stop() {
        System.out.println("Music is already stopped");
    }

    @Override
    public void next() {
        System.out.println("Locket...");
    }

    @Override
    public void prev() {
        System.out.println("Locket...");
    }
}
