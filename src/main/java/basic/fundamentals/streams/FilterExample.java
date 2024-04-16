package main.java.basic.fundamentals.streams;

import main.java.basic.fundamentals.streams.Entities.Person;

import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {


    public void printingPeopleList(List<Person> people) {
        people.forEach(System.out::println);
    }


    public List<Person> getPeopleOver18(List<Person> people) {

        return people
                .stream()
                .filter(p -> p.age() > 18)
                .collect(Collectors.toList());
    }











}
