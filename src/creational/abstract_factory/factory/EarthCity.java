package creational.abstract_factory.factory;

import creational.abstract_factory.City;

public class EarthCity implements City {

    @Override
    public String getName() {
        return "New York";
    }

    @Override
    public long getPopulation() {
        return 31231233;
    }
}
