package creational.abstract_factory.transport;

public class RealCarFactory extends AbstractTransportFactory {

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
