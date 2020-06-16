package structural.bridge.shapes;

public class Square implements Shape {

  private final Color color;

  public Square(Color color) {
    this.color = color;
  }

  @Override
  public String getShape() {
    return color.getColor() + " Square";
  }
}
