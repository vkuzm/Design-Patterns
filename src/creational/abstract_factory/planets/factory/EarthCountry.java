package creational.abstract_factory.planets.factory;

import creational.abstract_factory.planets.Country;

public class EarthCountry implements Country {

    @Override
    public String getName() {
        return "USA";
    }

    @Override
    public String getLanguage() {
        return "EN";
    }

    @Override
    public long getPopulation() {
        return 31232131;
    }

}
