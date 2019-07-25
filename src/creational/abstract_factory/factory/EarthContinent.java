package creational.abstract_factory.factory;

import creational.abstract_factory.Continent;

public class EarthContinent implements Continent {

    @Override
    public String getName() {
        return "North America";
    }

    @Override
    public long getSize() {
        return 13200000;
    }

    @Override
    public long getPopulation() {
        return 23300230;
    }

}
