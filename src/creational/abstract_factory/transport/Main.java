package creational.abstract_factory.transport;

public class Main {
    public static void main(String[] args) {
        // real
        AbstractTransportFactory carFactory = new RealCarFactory();
        Transport bmwCar = carFactory.createBmw();
        Transport fordCar = carFactory.createFord();

        AbstractTransportFactory bikeFactory = new RealBikeFactory();
        Transport bmwBike = bikeFactory.createBmw();
        Transport audiBike = bikeFactory.createAudi();

        bmwCar.move();
        fordCar.move();
        bmwBike.move();
        audiBike.move();

        // toy
        AbstractTransportFactory toyCarFactory = new ToyCarFactory();
        Transport toyBmwCar = toyCarFactory.createBmw();
        Transport toyFordCar = toyCarFactory.createFord();

        AbstractTransportFactory toyBikeFactory = new ToyBikeFactory();
        Transport toyBmwBike = toyBikeFactory.createBmw();
        Transport toyAudiBike = toyBikeFactory.createAudi();

        toyBmwCar.move();
        toyFordCar.move();
        toyBmwBike.move();
        toyAudiBike.move();
    }
}
