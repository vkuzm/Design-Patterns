package behavioral.command.restaurant;

public class Client {
  private RemoteCommand command;
  private String name;

  public Client(String name) {
    this.name = name;
  }

  public void setCommand(RemoteCommand command) {
    this.command = command;
  }

  public void makeOrder() {
    command.execute();
  }
}
