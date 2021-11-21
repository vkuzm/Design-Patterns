package creational.abstract_factory.planets;

import creational.abstract_factory.planets.factory.EarthFactory;
import creational.abstract_factory.planets.factory.MarsFactory;

public class Main {
    public static void main(String[] args) {
        generatePlanet(new EarthFactory());
        generatePlanet(new MarsFactory());
    }

    private static void generatePlanet(PlanetFactory planetFactory) {
        Continent continent = planetFactory.createContinent();
        Country country = planetFactory.createCountry();
        City city = planetFactory.createCity();

        System.out.println("CONTINENT");
        System.out.println("Name: " + continent.getName());
        System.out.println("Population: " + continent.getPopulation());
        System.out.println("Continent size: " + continent.getSize());

        System.out.println("");
        System.out.println("COUNTRY");
        System.out.println("Name: " + country.getName());
        System.out.println("Language: " + country.getLanguage());
        System.out.println("Population: " + country.getPopulation());

        System.out.println("");
        System.out.println("CITY");
        System.out.println("Name: " + city.getName());
        System.out.println("Population: " + city.getPopulation());

        System.out.println("-------------------------");
    }
}
