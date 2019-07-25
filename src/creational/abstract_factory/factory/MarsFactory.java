package creational.abstract_factory.factory;

import creational.abstract_factory.City;
import creational.abstract_factory.Country;
import creational.abstract_factory.PlanetFactory;
import creational.abstract_factory.Continent;

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
