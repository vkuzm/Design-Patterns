package behavioral.command.restaurant;

public class Waiter implements RemoteCommand {
  private Chef chef;
  private String food;

  public void takeOrder(String food) {
    this.food = food;
  }

  public void selectChef(Chef chef) {
    this.chef = chef;
  }

  @Override
  public void makeOrder() {
    chef.prepareFood(food);
  }
}
