package main.java.basic.fundamentals.streams;

import main.java.basic.fundamentals.streams.Entities.Person;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Map {

    public Set<String> getAllNames(List<Person> people) {
        return people
                .stream()
                .map(Person::name)
                .collect(Collectors.toSet());
    }

}
