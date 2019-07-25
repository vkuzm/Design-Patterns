package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class UnitComposite implements Unit{
    private List<Unit> units = new ArrayList<>();

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    @Override
    public void attack() {
        units.forEach(Unit::attack);
    }

    @Override
    public void defend() {
        units.forEach(Unit::defend);
    }

    @Override
    public void retreat() {
        units.forEach(Unit::retreat);
    }
}
