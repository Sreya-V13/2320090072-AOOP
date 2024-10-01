package poptrack;

import java.util.List;

public class CityTrackerDemo {
    public static void main(String[] args) {
        CityPopulationTracker tracker = new CityPopulationTracker();
        List<City> cities = CityUtils.initializeCities();
        
        // Adding cities to the tracker
        for (City city : cities) {
            tracker.addCity(city);
        }

        // Display all cities and their populations
        tracker.printAllCities();

        // Getting population of a specific city
        System.out.println("\nPopulation of Metropolis: " + tracker.getPopulation("Metropolis"));

        // Updating population of a city
        tracker.updatePopulation("Gotham", 1500000); // Update Gotham's population to 1.5 million
        
        // Print all cities again to reflect changes
        System.out.println("\nUpdated city populations:");
        tracker.printAllCities();
    }
}
