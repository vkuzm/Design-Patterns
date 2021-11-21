package creational.factory.transport;

public class CarFactory extends TransportFactory {

    @Override
    public Transport createFord() {
        return new CarFord();
    }

    @Override
    public Transport createBmw() {
        return new CarBmw();
    }

    @Override
    public Transport createAudi() {
        throw new IllegalArgumentException();
    }
}
