package structural.composite.units;

public class Tank implements Unit{
    private final String name;

    public Tank(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("Tank " + this.name + " is attacking");
    }

    @Override
    public void defend() {
        System.out.println("Tank " + this.name + " is defending");
    }

    @Override
    public void retreat() {
        System.out.println("Tank " + this.name + " is retreating");
    }
}
