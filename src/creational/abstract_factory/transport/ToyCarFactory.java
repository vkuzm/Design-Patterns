package creational.abstract_factory.transport;

public class ToyCarFactory extends AbstractTransportFactory {

    @Override
    public Transport createFord() {
        return new ToyCarFord();
    }

    @Override
    public Transport createBmw() {
        return new ToyCarBmw();
    }

    @Override
    public Transport createAudi() {
        throw new IllegalArgumentException();
    }
}