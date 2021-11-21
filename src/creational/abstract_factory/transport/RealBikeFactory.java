package creational.abstract_factory.transport;

public class RealBikeFactory extends AbstractTransportFactory {

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
