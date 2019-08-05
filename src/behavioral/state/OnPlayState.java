package behavioral.state;

public class OnPlayState implements PlayerState {

    private AudioPlayer audioPlayer;

    {
        System.out.println("STATUS: Music is playing");
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
        audioPlayer.setState(new OnPauseState());
    }

    @Override
    public void stop() {
        audioPlayer.setState(new OnStopState());
    }

    @Override
    public void next() {
        audioPlayer.nextTrack();
    }

    @Override
    public void prev() {
        audioPlayer.previousTrack();
    }
}
