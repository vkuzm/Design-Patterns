package behavioral.command;

public class TVOnCommand implements RemoteCommand {
    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }
}
