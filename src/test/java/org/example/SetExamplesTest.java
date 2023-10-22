package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetExamplesTest {
    SetExamples setExamples = new SetExamples();

    @Test
    void removeDuplicate() {
        List<Integer> numbers = List.of(20, 30, 30, 40, 50, 60, 60);
        List<Integer> numbers1 = List.of(20, 30, 30, 40, 50, 70, 70);
        Set<Integer> answer = Set.of(20, 30, 40, 50, 60);
        Set<Integer> answer1 = Set.of(20, 30, 40, 50, 70);
        Set<Integer> result = setExamples.removeDuplicate(numbers);
        Set<Integer> result1 = setExamples.removeDuplicate(numbers1);
        assertEquals(answer, result);
        assertEquals(answer1, result1);


    }
}