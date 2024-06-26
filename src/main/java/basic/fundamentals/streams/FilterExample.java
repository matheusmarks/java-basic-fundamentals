package main.java.basic.fundamentals.streams;

import main.java.basic.fundamentals.streams.Entities.Person;

import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {


    public void printingPeopleList(List<Person> people) {
        System.out.println("------------------ PRINTING ALL PEOPLE -------------------------");
        people.forEach(System.out::println);
        System.out.println("----------------------------------------------------------------");
    }


    public List<Person> getPeopleOver18(List<Person> people) {

        return people
                .stream()
                .filter(p -> p.age() > 18)
                .collect(Collectors.toList());
    }


    public List<Person> getPeopleNamesStatingWith(List<Person> people, String initialLetterName) {
        return people
                .stream()
                .filter(person -> person.name().startsWith(initialLetterName))
                .collect(Collectors.toList());
    }








}
