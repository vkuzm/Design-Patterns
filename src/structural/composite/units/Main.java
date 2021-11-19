package structural.composite.units;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        UnitComposite unitComposite = new UnitComposite();

        unitComposite.addUnit(new Soldier("Machine gunner"));
        unitComposite.addUnit(new Soldier("Machine gunner 2"));
        unitComposite.addUnit(new Soldier("Rocket launcher"));
        unitComposite.addUnit(new Tank("T-156"));
        unitComposite.addUnit(new Tank("Tiger"));
        unitComposite.addUnit(new Soldier("Sniper"));
        unitComposite.addUnit(new Soldier("Sniper 2"));

        // The army is attacking
        unitComposite.attack();
        Thread.sleep(2000);

        // The army is defending
        unitComposite.defend();
        Thread.sleep(2000);

        // The army is retreating
        unitComposite.retreat();
    }
}
