package main.java.basic.fundamentals.streams;

import main.java.basic.fundamentals.streams.Entities.Person;

import java.util.List;

public class Reduce {


    public Integer getSumOfAllAges(List<Person> people) {
        return people
                .stream()
                .map(person -> person.age())
                .reduce(0,(subtotal, age) -> subtotal + age);gi
    }

    public Double getAverageAge(List<Person> people) {
        return people
                .stream()
                .map(person -> person.age())
                .reduce(0,(subtotal, age) -> (subtotal + age/people.size()))
                .doubleValue();
    }

}
