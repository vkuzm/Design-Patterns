package behavioral.template_method;

public class CarRoute extends FindRoute {

    @Override
    void findRoute() {
        System.out.println("Searching the route to " + super.to + "...");
    }

    @Override
    void calculateDistance() {
        super.distance = super.to.length() + super.from.length();
    }

    @Override
    void printResult() {
        System.out.println("Found the route for a car from " + from + " to " + to);
        System.out.println("Distance: " + super.distance + " miles");
    }
}
