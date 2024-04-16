package main.java.basic.fundamentals.streams;

import main.java.basic.fundamentals.streams.Entities.Person;

import java.util.List;

public class Reduce {


    public Integer getSumOfAllAges(List<Person> people) {

        return people
                .stream()
                .map(Person::age)
                .reduce(0,Integer::sum);
    }

    public Double getAverageAge(List<Person> people) {
        return people
                .stream()
                .map(Person::age)
                .reduce(0,(subtotal, age) -> (subtotal + age/people.size()))
                .doubleValue();
    }

}
