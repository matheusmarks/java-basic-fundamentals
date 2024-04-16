package main.java.basic.fundamentals.streams.Data;

import main.java.basic.fundamentals.streams.Entities.Person;

import java.util.List;

public class MockData {

    private static List<Person> people = List.of(
            new Person("Matheus", 23, 'M', "High School Degree"),
            new Person("Rebeca", 21, 'F', "Advocate Degree"),
            new Person("Alex", 38, 'M', "No Scholarship"),
            new Person("Brenda", 21, 'F', "Student"),
            new Person("Cole", 27, 'M', "Student"),
            new Person("Miranda", 65, 'F', "High School Degree"),
            new Person("Louis", 10, 'M', "Student"),
            new Person("Marcus", 21, 'M', "High School Degree"),
            new Person("Jeena", 28, 'F', "High School Degree")

    );


    public static List<Person> getPeople() {
        return people;
    }


}
