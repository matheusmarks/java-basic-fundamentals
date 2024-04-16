package main.java.basic.fundamentals.streams;

import main.java.basic.fundamentals.streams.Data.MockData;
import main.java.basic.fundamentals.streams.Entities.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = MockData.getPeople();

        FilterExample filterExample = new FilterExample();
        Reduce reduceExample = new Reduce();


        filterExample.printingPeopleList(people);
        System.out.println("SUM OF AGES: " + reduceExample.getSumOfAllAges(people));
        System.out.println("AVERAGE AGE: " + reduceExample.getAverageAge(people));
    }
}
