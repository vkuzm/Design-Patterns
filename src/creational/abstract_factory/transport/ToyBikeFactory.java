package creational.abstract_factory.transport;

public class ToyBikeFactory extends AbstractTransportFactory {

    @Override
    public Transport createFord() {
        throw new IllegalArgumentException();
    }

    @Override
    public Transport createBmw() {
        return new ToyBikeBmw();
    }

    @Override
    public Transport createAudi() {
        return new ToyBikeAudi();
    }
}
