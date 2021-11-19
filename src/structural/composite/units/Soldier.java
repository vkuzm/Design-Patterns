package structural.composite.units;

public class Soldier implements Unit{
    private final String name;

    public Soldier(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("Soldier " + this.name + " is attacking");
    }

    @Override
    public void defend() {
        System.out.println("Soldier " + this.name + " is defending");
    }

    @Override
    public void retreat() {
        System.out.println("Soldier " + this.name + " is retreating");
    }
}
