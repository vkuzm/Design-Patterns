package creational.abstract_factory.planets.factory;

import creational.abstract_factory.planets.City;
import creational.abstract_factory.planets.Continent;
import creational.abstract_factory.planets.Country;
import creational.abstract_factory.planets.PlanetFactory;

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
