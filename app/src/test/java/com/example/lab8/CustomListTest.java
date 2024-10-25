package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Montreal", "QC"));

        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    void testHasCity() {
        list = MockCityList();
        City city = new City("Dhaka", "BD");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    void testDelete() {
        list = MockCityList();

        City city = new City("Vancouver", "BC");
        list.addCity(city);

        assertEquals(1, list.getCount());

        list.delete(city);

        assertEquals(0, list.getCount());
    }

//    @Test
//    void testCountCities() {
//        list = MockCityList();
//
//        City city1 = new City("Montreal", "QC");
//        list.addCity(city1);
//
//        City city2 = new City("Toronto", "ON");
//        list.addCity(city2);
//
//        City city3 = new City("Vancouver", "BC");
//        list.addCity(city3);
//
//        assertEquals(3, list.countCities());
//
//    }
}
