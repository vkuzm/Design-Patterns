package behavioral.command;

public class TVOffCommand implements RemoteCommand {
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
