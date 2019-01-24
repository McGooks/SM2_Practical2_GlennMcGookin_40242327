package Part1;

public class CityAdmin {
    public static void main(String[] args) {
        City c1 = new City("Beijing", 11, true, "China");
        City c2 = new City("Madrid", 5, true, "Spain");
        City c3 = new City("Rome", 6, true, "Italy");
        City c4 = new City("New York", 8, false, "USA");
        City c5 = new City("Washington", 2, true, "USA");
        City c6 = new City("Dallas", 3, false, "USA");

        City[] cities = {c1, c2, c3, c4, c5, c6};

        displayAll(cities);

        smallestCity(cities);

        capitalCitySearch(cities);

        cityByCountry(cities, "USA");

        averagePopulation(cities);
    }

    private static void displayAll(City[] cities) {
        System.out.println("Displaying all cities ");
        for (City city : cities) {
            System.out.println(city.toString());
        }
        System.out.println();
    }

    private static void smallestCity(City[] cities) {
        int smallest = cities[0].getPopulation();
        String cityName = cities[0].getCityName();
        for (int loop = 0; loop < cities.length; loop++) {
            if (cities[loop].getPopulation() < smallest) {
                smallest = cities[loop].getPopulation();
                cityName = cities[loop].getCityName();
            }
        }
        System.out.println("The smallest city is " + cityName);
        System.out.println();
    }

    private static void capitalCitySearch(City[] cities) {
        boolean capital = true;
        String cityName;
        String countryName;
        for (int loop = 0; loop < cities.length; loop++) {
            if (cities[loop].isCountryCapital() == capital) {
                cityName = cities[loop].getCityName();
                countryName = cities[loop].getCountry();
                System.out.println(cityName + " is the capital of " + countryName);
            }
        }
        System.out.println();
    }

    private static void cityByCountry(City[] cities, String country) {
        String c = country;
        String cityName;
        for (int loop = 0; loop < cities.length; loop++) {
            if (c.equalsIgnoreCase(cities[loop].getCountry())){
                cityName = cities[loop].getCityName();
                System.out.println(cityName + " is a city in " + c);
            }
        }
        System.out.println();
    }

    private static void averagePopulation(City[] cities) {
        int total = 0;
        double avg = 0.0;
        int counter = 0;

        for (int loop = 0; loop < cities.length; loop++) {
            total += cities[loop].getPopulation();
            counter++;
        }
        avg = total / counter;
        System.out.printf("The average population is %.2f",avg);
    }

}
