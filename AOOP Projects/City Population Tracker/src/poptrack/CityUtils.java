package poptrack;

import java.util.ArrayList;
import java.util.List;

public class CityUtils {

    // Method to initialize a list of cities with populations
    public static List<City> initializeCities() {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Metropolis", 9000000));    // Population of Metropolis
        cities.add(new City("Gotham", 1200000));        // Population of Gotham
        cities.add(new City("Star City", 600000));      // Population of Star City
        cities.add(new City("Central City", 1500000));  // Population of Central City
        cities.add(new City("Coast City", 800000));     // Population of Coast City
        cities.add(new City("Blüdhaven", 350000));      // Population of Blüdhaven
        cities.add(new City("Smallville", 45000));      // Population of Smallville
        cities.add(new City("Hyderabad", 6800000));     // Population of Hyderabad
        return cities;
    }
}
