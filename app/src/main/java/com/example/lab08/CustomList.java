package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    // removes the first matching city from the list, returns true if found
    public void deleteCity(City city) {
        cities.remove(city);
    }

    public int countCities() {
        return cities.size();
    }
}
