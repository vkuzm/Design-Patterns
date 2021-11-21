package creational.factory.pizza_store;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        if (type == PizzaType.CHEESE) {
            return new NYStyleCheesePizza();
        } else {
            return null;
        }
    }
}
