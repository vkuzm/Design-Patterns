package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

    private List<Observer> observerList = new ArrayList<>();
    private String productName;
    private float productPrice;
    private String productAvailability;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductAvailability(String productAvailability) {
        this.productAvailability = productAvailability;

        // Notify all observers
        //this.notifyAllObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        observerList.forEach(observer
                -> observer.update(productAvailability, this.productName));
    }
}
