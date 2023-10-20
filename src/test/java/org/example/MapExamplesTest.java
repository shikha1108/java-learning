package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapExamplesTest {
    MapExamples mapExamples = new MapExamples();

    @Test
    void findKey() {
        Map<String, Integer> fruits = Map.of("apple", 2, "banana", 5, "orange", 5);
        Map<String, Integer> fruits1 = Map.of("apple", 2, "banana", 5, "orange", 5);
        Boolean answer = mapExamples.findKey(fruits, "orange");
        Boolean answer1 = mapExamples.findKey(fruits, "kiwi");
        assertEquals(true, answer);
        assertEquals(false, answer1);
    }

    @Test
    void sum() {
        Map<String, Integer> fruitsMap = Map.of("apple", 5, "banana", 3, "orange", 2);
        Map<String, Integer> fruitsMap1 = Map.of("apple", 5, "banana", 3, "orange", 4);
        Integer result = mapExamples.sum(fruitsMap);
        Integer result1 = mapExamples.sum(fruitsMap1);
        assertEquals(10, result);
        assertEquals(12, result1);
    }

    @Test
    void keyOfString() {
        Map<String, Integer> fruitsMap = Map.of("apple", 5, "banana", 3, "orange", 2);
        Map<String, Integer> fruitsMap1 = Map.of("kiwi", 6, "banana", 3, "orange", 2);
        List<String> newList = List.of("apple", "orange", "banana");
        List<String> newList1 = List.of("kiwi", "banana", "orange");
        List<String> answer = mapExamples.keyOfString(fruitsMap);
        List<String> answer1 = mapExamples.keyOfString(fruitsMap);
        assertEquals(newList, answer);
        assertEquals(newList1, answer1);

    }
}