package creational.abstract_factory.planets.factory;

import creational.abstract_factory.planets.Country;

public class MarsCountry implements Country {

    @Override
    public String getName() {
        return "Mars republic";
    }

    @Override
    public String getLanguage() {
        return "EN";
    }

    @Override
    public long getPopulation() {
        return 1000;
    }
}
