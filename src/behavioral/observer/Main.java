package behavioral.observer;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Observer 1
        Person person = new Person();
        person.setName("Alex");

        // Observer 2
        Person person2 = new Person();
        person2.setName("Max");

        // Observable subject
        Product product = new Product();
        product.setProductName("Iphone 100x");
        product.setProductPrice(100100);
        product.setProductAvailability("Out of stock");

        // Add observers
        product.addObserver(person);
        product.addObserver(person2);

        // Notify all observers
        product.notifyAllObservers();

        // Delay
        Thread.sleep(3000);
        System.out.println("");

        // Product is available now
        // Update all observers
        product.setProductAvailability("In Stock");

        // Notify all observers
        product.notifyAllObservers();
    }
}
