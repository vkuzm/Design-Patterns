package creational.abstract_factory.planets.factory;

import creational.abstract_factory.planets.City;

public class MarsCity implements City {

    @Override
    public String getName() {
        return "Colony 1";
    }

    @Override
    public long getPopulation() {
        return 1000;
    }
}
