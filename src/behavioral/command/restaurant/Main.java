package behavioral.command.restaurant;

public class Main {

  public static void main(String[] args) {

    // Sender
    Client client = new Client("Peter");

    // Receiver
    Chef chef = new Chef("Chef Antonio");

    // Command
    Waiter waiter = new Waiter();
    waiter.takeOrder("Potato and Vine");
    waiter.selectChef(chef);

    // Say the waiter to take the order
    client.setCommand(waiter);
    client.makeOrder();
  }
}
