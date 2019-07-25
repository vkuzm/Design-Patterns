package structural.facade;

public class CarWash {
    public void driveInTo() throws InterruptedException {
        System.out.println("Drives the car into the car wash");
        Thread.sleep(300);
    }

    public void washOutside() throws InterruptedException {
        System.out.println("Washes the car outside");
        Thread.sleep(500);
    }

    public void washInside() throws InterruptedException {
        System.out.println("Washes the car inside");
        Thread.sleep(500);
    }

    public void driveOut() throws InterruptedException {
        System.out.println("Drives the car out of the car wash");
        Thread.sleep(300);
    }
}

