package creational.prototype;

public class Car implements Cloneable {
    private String manufacturer;
    private String model;
    private String color;
    private int maxSpeed;

    public Car() {
    }

    public Car(Car car) {
        if (car != null) {
            this.manufacturer = car.manufacturer;
            this.model = car.model;
            this.color = car.color;
            this.maxSpeed = car.maxSpeed;
        }
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(this);
    }
}
