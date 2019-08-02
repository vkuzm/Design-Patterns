package behavioral.observer;

public class Person implements Observer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String productAvailability, String productName) {
        System.out.println("Hi, " + getName() + ". Product " + productName
                + " now is " + productAvailability + "!");
    }
}
