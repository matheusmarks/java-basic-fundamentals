package main.java.basic.fundamentals.streams;

import main.java.basic.fundamentals.streams.Entities.Person;
import main.java.basic.fundamentals.streams.Entities.PersonDTO;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {

    public Set<String> getAllNames(List<Person> people) {
        return people
                .stream()
                .map(Person::name)
                .collect(Collectors.toSet());
    }

    public Map<Integer, List<PersonDTO>> groupingByAge(List<Person> people) {
        return people
                .stream()
                .map(p -> new PersonDTO(p.name(), p.age()))
                .collect(Collectors.groupingBy(PersonDTO::age));
    }

}
