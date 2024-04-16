package main.java.basic.fundamentals.streams;

import main.java.basic.fundamentals.streams.Entities.Person;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStream {

    public <T> List<T> transformSeqListIntoParallelList(List<T> list) {
        return list.stream().parallel().toList();
    }

}
