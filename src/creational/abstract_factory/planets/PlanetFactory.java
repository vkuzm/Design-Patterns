package creational.abstract_factory.planets;

public interface PlanetFactory {
    Continent createContinent();

    Country createCountry();

    City createCity();
}
