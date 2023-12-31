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

    @Test
    void findIntersection() {
    }

    @Test
    void findUnion() {
        Set<Integer> set1 = Set.of(10,20,30);
        Set<Integer> set2 = Set.of(20,30,40);
        Set<Integer> answer1 = Set.of(10,20,30,40);
        Set<Integer> result = setExamples.findUnion(set1,set2);
        assertEquals(answer1,result);
    }

    @Test
    void findDifference() {
        Set<Integer> set1 = Set.of(2,4,6,8,10);
        Set<Integer> set2 = Set.of(1,3,5,7,11,10);
        Set<Integer> result = Set.of(2,4,6,8);
        Set<Integer> answer1 = setExamples.findDifference(set1,set2);
        assertEquals(result, answer1);
    }

    @Test
    void findInteraction1() {
        Set<Integer> set1 = Set.of(1,2,3,4);
        Set<Integer> set2 = Set.of(3,4,5,6);
        Set<Integer> result = Set.of(3,4);
        Set<Integer> answer = setExamples.findIntersaction(set1, set2);
        assertEquals(result, answer);

    }
}