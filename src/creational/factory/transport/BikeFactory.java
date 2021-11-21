package creational.factory.transport;

public class BikeFactory extends TransportFactory {

    @Override
    public Transport createFord() {
        throw new IllegalArgumentException();
    }

    @Override
    public Transport createBmw() {
        return new BikeBmw();
    }

    @Override
    public Transport createAudi() {
        return new BikeAudi();
    }
}
