package creational.abstract_factory.planets.factory;

import creational.abstract_factory.planets.City;
import creational.abstract_factory.planets.Country;
import creational.abstract_factory.planets.PlanetFactory;
import creational.abstract_factory.planets.Continent;

public class MarsFactory implements PlanetFactory {
    public static final String name = "Mars";

    @Override
    public Continent createContinent() {
        return new MarsContinent();
    }

    @Override
    public Country createCountry() {
        return new MarsCountry();
    }

    @Override
    public City createCity() {
        return new MarsCity();
    }
}
