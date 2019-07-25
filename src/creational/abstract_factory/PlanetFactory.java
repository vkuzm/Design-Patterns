package creational.abstract_factory;

public interface PlanetFactory {
    Continent createContinent();

    Country createCountry();

    City createCity();
}
