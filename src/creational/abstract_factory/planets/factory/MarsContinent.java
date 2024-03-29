package creational.abstract_factory.planets.factory;

import creational.abstract_factory.planets.Continent;

public class MarsContinent implements Continent {

    @Override
    public String getName() {
        return "Mars continent";
    }

    @Override
    public long getSize() {
        return 1230423;
    }

    @Override
    public long getPopulation() {
        return 1000;
    }
}
