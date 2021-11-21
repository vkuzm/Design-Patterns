package creational.factory.pizza_store;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {
        if (type == PizzaType.CHEESE) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}
