package creational.factory.transport;

public class Main {
    public static void main(String[] args) {
        TransportFactory carFactory = new CarFactory();
        Transport bmwCar = carFactory.createBmw();
        Transport fordCar = carFactory.createFord();

        TransportFactory bikeFactory = new BikeFactory();
        Transport bmwBike = bikeFactory.createBmw();
        Transport audiBike = bikeFactory.createAudi();

        bmwCar.move();
        fordCar.move();
        bmwBike.move();
        audiBike.move();
    }
}
