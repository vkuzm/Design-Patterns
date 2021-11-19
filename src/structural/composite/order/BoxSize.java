package structural.composite.order;

public enum BoxSize {
    BIG("Big"), MEDIUM("Medium"), SMALL("Small");

    private final String size;

    BoxSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
