package behavioral.observer;

@FunctionalInterface
public interface Observer {
    void update(String productAvailability, String productName);
}
