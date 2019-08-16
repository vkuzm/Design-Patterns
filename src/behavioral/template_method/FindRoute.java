package behavioral.template_method;

public abstract class FindRoute {
    public String from;
    public String to;
    public int distance;

    public final void init(String from, String to) {
        this.from = from;
        this.to = to;

        findRoute();
        calculateDistance();
        printResult();

        //
        System.out.println("\n");
    }

    abstract void findRoute();

    abstract void calculateDistance();

    abstract void printResult();
}
