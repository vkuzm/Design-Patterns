package behavioral.command.restaurant;

public class Chef {
  private String name;

  public Chef(String name) {
    this.name = name;
  }

  public void prepareFood(String food) {
      System.out.println(name + " is preparing food: " + food);
    }
}
