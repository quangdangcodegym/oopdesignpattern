package com.codegym.iterator.collectioniterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listOfCountries = new ArrayList<>();
        listOfCountries.add("Viet Nam");
        listOfCountries.add("Campuchia");
        listOfCountries.add("Lao");
        listOfCountries.add("Thailand");
        listOfCountries.add("Japan");

        System.out.println("Iterator is using with arraylist");
        Iterator<String> iterator = listOfCountries.iterator();
        while (iterator.hasNext()) {
            String countryName = iterator.next();
            System.out.println("Country Name: " + countryName);
        }

        System.out.println("Iterator is using with arraylist");
        Set<String> setOfCountries = new HashSet<>();
        setOfCountries.add("Italia");
        setOfCountries.add("Spain");
        setOfCountries.add("England");
        setOfCountries.add("Franche");

        Iterator<String> iteratorSet = setOfCountries.iterator();
        while (iteratorSet.hasNext()) {
            String countryName = iteratorSet.next();
            System.out.println("Country Name: " + countryName);
        }

    }
}
