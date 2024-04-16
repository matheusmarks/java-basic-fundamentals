package main.java.basic.fundamentals.streams;

import main.java.basic.fundamentals.streams.Data.MockData;
import main.java.basic.fundamentals.streams.Entities.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = MockData.getPeople();
        String initialLetterName = "R";

        FilterExample filterExample = new FilterExample();
        ReduceExample reduceExample = new ReduceExample();
        MapExample mapExample = new MapExample();


        filterExample.printingPeopleList(people);

        System.out.println("NAMES STARTING WITH "+ initialLetterName + ": " +
                filterExample.getPeopleNamesStatingWith(people, initialLetterName));
        System.out.println("SUM OF AGES: " + reduceExample.getSumOfAllAges(people));
        System.out.println("AVERAGE AGE: " + reduceExample.getAverageAge(people));
        System.out.println("ALL NAMES: " + mapExample.getAllNames(people));
        System.out.println("GROUPED BY AGE: " + mapExample.groupingByAge(people));
    }
}
