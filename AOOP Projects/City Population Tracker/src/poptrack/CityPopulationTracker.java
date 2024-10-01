package poptrack;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CityPopulationTracker {
    private Map<String, Integer> cityPopulationMap;

    public CityPopulationTracker() {
        cityPopulationMap = new HashMap<>();
    }

    // Add a city and its population
    public void addCity(City city) {
        cityPopulationMap.put(city.getCityName(), city.getPopulation());
    }

    // Get the population of a specific city
    public int getPopulation(String cityName) {
        return cityPopulationMap.getOrDefault(cityName, 0);
    }

    // Update the population of an existing city
    public void updatePopulation(String cityName, int newPopulation) {
        if (cityPopulationMap.containsKey(cityName)) {
            cityPopulationMap.put(cityName, newPopulation);
        } else {
            System.out.println("City not found!");
        }
    }

    // Remove a city from the tracker
    public void removeCity(String cityName) {
        cityPopulationMap.remove(cityName);
    }

    // Print all cities and their populations
    public void printAllCities() {
        Set<Map.Entry<String, Integer>> entries = cityPopulationMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
