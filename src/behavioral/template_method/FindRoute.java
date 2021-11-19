package behavioral.template_method;

public abstract class FindRoute {
    public String from;
    public String to;
    public int distance;

    public void init(String from, String to) {
        this.from = from;
        this.to = to;

        findRoute();
        calculateDistance();
        printResult();

        System.out.println("\n");
    }

    abstract String getName();
    abstract void calculateDistance();

    public void findRoute() {
        System.out.println("Searching the route to " + this.to + "...");
    }

    public void printResult() {
        System.out.println("Found the route for a " + this.getName() + " from " + from + " to " + to);
        System.out.println("Distance: " + this.distance + " miles");
    }
}
