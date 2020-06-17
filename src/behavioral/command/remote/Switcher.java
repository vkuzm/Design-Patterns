package behavioral.command.remote;

public class Switcher {
    private RemoteCommand command;

    public void setCommand(RemoteCommand command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
