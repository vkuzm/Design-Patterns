package behavioral.state;

public class OnPauseState implements PlayerState{

    private AudioPlayer audioPlayer;

    {
        System.out.println("STATUS: Music is paused");
    }

    @Override
    public void setPlayer(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void play() {
        audioPlayer.startPlayback();
    }

    @Override
    public void pause() {
        System.out.println("Music is already paused");
    }

    @Override
    public void stop() {
        audioPlayer.setState(new OnStopState());
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
