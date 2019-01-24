package Part1;

public class City {
    private String cityName;
    private int population;
    private boolean countryCapital;
    private String country;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public boolean isCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(boolean countryCapital) {
        this.countryCapital = countryCapital;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public City(){

    }

    public City(String cityName, int population, boolean countryCapital, String country) {
        this.cityName = cityName;
        this.population = population;
        this.countryCapital = countryCapital;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Part1.City{" +
                "cityName='" + cityName + '\'' +
                ", population=" + population +
                ", countryCapital=" + countryCapital +
                ", country='" + country + '\'' +
                '}';
    }
}
