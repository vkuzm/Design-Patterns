package behavioral.template_method;

public class Main {

  public static void main(String[] args) {
    FindRoute findCartRoute = new CarRoute();
    findCartRoute.init("New York", "Miami");

    FindRoute findPTransportRoute = new PublicTransportRoute();
    findPTransportRoute.init("Barcelona", "Berlin");

    FindRoute findWalkRoute = new WalkRoute();
    findWalkRoute.init("London", "Paris");
  }
}
