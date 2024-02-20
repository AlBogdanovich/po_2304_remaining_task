package by.itclass.model;

import by.itclass.utils.CompetitionUtils;

import java.util.ArrayList;
import java.util.HashMap;

import static by.itclass.model.Genus.*;
import static by.itclass.utils.CompetitionUtils.*;

public class Main {
    public static void main(String[] args) {

        var cats = new ArrayList<Cat>();
        var dogs = new ArrayList<Dog>();
        var errors = new HashMap<String, String>();

        CompetitionUtils.parseFile(cats, dogs, errors);

        var sortedCats = sortByBirthDate(cats);
        var sortedDogs = sortByBirthDate(dogs);
        printResults(sortedCats, sortedDogs, errors);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        var youngCats = filterAnimals(sortedCats, true);
        //var yc = sortByBirthDate(filterAnimals(cats, true))
        var oldCats = filterAnimals(sortedCats, false);
        var youngDogs = filterAnimals(sortedDogs, true);
        var oldDogs = filterAnimals(sortedDogs, false);

        printResults(youngCats, youngDogs, oldCats, oldDogs, errors);
    }
}
