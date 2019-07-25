package creational.abstract_factory.factory;

import creational.abstract_factory.City;
import creational.abstract_factory.Continent;
import creational.abstract_factory.Country;
import creational.abstract_factory.PlanetFactory;

public class EarthFactory implements PlanetFactory {
    public static final String name = "Earth";

    public String getName() {
        return name;
    }

    @Override
    public Continent createContinent() {
        return new EarthContinent();
    }

    @Override
    public Country createCountry() {
        return new EarthCountry();
    }

    @Override
    public City createCity() {
        return new EarthCity();
    }
}
