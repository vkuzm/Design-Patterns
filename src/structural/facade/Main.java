package structural.facade;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        CarWash carWash = new CarWash();
        carWash.driveInTo();
        carWash.washOutside();
        carWash.washInside();
        carWash.driveOut();
    }
}
