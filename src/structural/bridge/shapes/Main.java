package structural.bridge.shapes;

public class Main {

  public static void main(String[] args) {
    Shape circle = new Circle(new Blue());
    System.out.println(circle.getShape());

    Shape square = new Square(new Red());
    System.out.println(square.getShape());

    Shape circle2 = new Circle(new Red());
    System.out.println(circle2.getShape());

    Shape square2 = new Square(new Blue());
    System.out.println(square2.getShape());
  }

}
