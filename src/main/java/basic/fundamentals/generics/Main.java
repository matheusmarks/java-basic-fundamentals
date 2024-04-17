package main.java.basic.fundamentals.generics;

import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public static void printList(List<?> myList) {
        myList.forEach(System.out::println);
    }

    public static void printBoundedList(List<? extends Animal> myAnimalList) {
        myAnimalList.forEach(System.out::println);
    }

    public static <T> void printGenericTypeTList(List<T> myList) {
        myList.forEach(System.out::println);
    }
}
