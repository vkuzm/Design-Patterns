package creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Car car = new Car();
        car.setManufacturer("BMW");
        car.setModel("M5");
        car.setColor("Red");
        car.setMaxSpeed(320);

        System.out.println(car.getManufacturer() + " " + car.getModel() + " " + car.getColor() + " " + car.getMaxSpeed());
        System.out.println(car.hashCode());

        // Clone the car
        Car clonedCar = car.clone();
        clonedCar.setModel("M6");
        clonedCar.setMaxSpeed(340);

        System.out.println(clonedCar.getManufacturer() + " " + clonedCar.getModel() + " " + clonedCar.getColor() + " " + clonedCar.getMaxSpeed());
        System.out.println(clonedCar.hashCode());
    }
}
