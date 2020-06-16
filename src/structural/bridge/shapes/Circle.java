package structural.bridge.shapes;

public class Circle implements Shape {

  private final Color color;

  public Circle(Color color) {
    this.color = color;
  }

  @Override
  public String getShape() {
    return color.getColor() + " Circle";
  }
}
