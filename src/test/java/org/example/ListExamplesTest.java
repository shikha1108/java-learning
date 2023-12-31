package org.example;

import java.util.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.junit.jupiter.api.Assertions.*;

class ListExamplesTest {
    ListExamples listExamples = new ListExamples();

    @Test
    void findIndex() {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        List<Integer> nums1 = List.of(1, 2, 3, 4, 5);
        List<Integer> nums2 = List.of();
        Integer result = listExamples.findIndex(nums, 5);
        Integer result1 = listExamples.findIndex(nums1, 2);
        Integer result2 = listExamples.findIndex(nums2, 10);
        assertEquals(4, result);
        assertEquals(1, result1);
        assertEquals(-1, result2);
    }

    @Test
    void reverse() {
        List<Integer> nums = List.of(10, 20, 30, 40, 50);
        List<Integer> nums1 = List.of(10, 30, 20, 40, 50);
        List<Integer> reverseList = List.of(50, 40, 30, 20, 10);
        List<Integer> reverseList1 = List.of(50, 40, 20, 30, 10);
        List<Integer> answer = listExamples.reverse(nums);
        List<Integer> answer1 = listExamples.reverse(nums1);
        assertEquals(reverseList, answer);
        assertEquals(reverseList1, answer1);
    }

    @Test
    void findSecondLargest() {
        List<Integer> nums = List.of(40, 20, 30, 10, 70);
        Integer result = listExamples.findSecondLargest(nums);
        assertEquals(40, result);
    }

    @Test
    void firstElement() {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        List<Integer> nums1 = List.of(2, 1, 3, 4, 5);
        Integer result = listExamples.firstElement(nums);
        Integer result1 = listExamples.firstElement(nums1);
        assertEquals(1, result);
        assertEquals(2, result1);
    }

    @Test
    void lastElement() {
        List<Integer> nums = List.of(10, 20, 30, 40, 50);
        List<Integer> nums1 = List.of(10, 20, 30, 40, 60);
        Integer result = listExamples.lastElement(nums);
        Integer result1 = listExamples.lastElement(nums1);
        assertEquals(50, result);
        assertEquals(60, result1);
    }

    @Test
    void secondLastElement() {
        List<Integer> nums = List.of(10, 20, 50, 40, 60);
        List<Integer> nums1 = List.of(10, 20, 40, 50, 60);
        Integer result = listExamples.secondLastElement(nums);
        Integer result1 = listExamples.secondLastElement(nums1);
        assertEquals(40, result);
        assertEquals(50, result1);
    }

    @Test
    void sumOfAll() {
        List<Integer> nums = List.of(10, 20, 30, 40, 50);
        List<Integer> nums1 = List.of(10, 20, 30, 40, 10);
        Integer result = listExamples.sumOfAll(nums);
        Integer result1 = listExamples.sumOfAll(nums1);
        assertEquals(150, result);
        assertEquals(110, result1);
    }

    @Test
    void findMaximum() {
        List<Integer> numbers = List.of(10, 20, 40, 30);
        List<Integer> numbers1 = List.of(1, 2, 4, 3);
        Integer result = listExamples.findMaximum(numbers);
        Integer result1 = listExamples.findMaximum(numbers1);
        assertEquals(40, result);
        assertEquals(4, result1);
    }

    @Test
    void findMinimum() {
        List<Integer> nums = List.of(20, 40, 30, 10, 50);
        List<Integer> nums1 = List.of(20, 30, 50, 40);
        Integer result = listExamples.findMinimum(nums);
        Integer result1 = listExamples.findMinimum(nums1);
        assertEquals(10, result);
        assertEquals(20, result1);
    }

    @Test
    void removeDuplicate() {
        List<Integer> nums = List.of(1, 2, 2, 3, 4, 4);
        List<Integer> nums1 = List.of(1, 1, 2, 6, 6, 4);
        List<Integer> n = List.of(1, 2, 3, 4);
        List<Integer> n1 = List.of(1, 2, 6, 4);
        List<Integer> answer = listExamples.removeDuplicate(nums);
        List<Integer> answer1 = listExamples.removeDuplicate(nums1);
        assertEquals(n, answer);
        assertEquals(n1, answer1);
    }

    @Test
    void getMiddleNumber() {
        List<Integer> nums = List.of(10, 20, 30, 40, 50);
        List<Integer> nums1 = List.of(10, 20, 40, 50, 60);
        Integer result = listExamples.getMiddleNumber(nums);
        Integer result1 = listExamples.getMiddleNumber(nums1);
        assertEquals(30, result);
        assertEquals(40, result1);
    }

    @Test
    void getMiddleAndPlusTwo() {
        List<Integer> nums = List.of(10, 20, 30, 40, 50);
        List<Integer> nums1 = List.of(1, 2, 3, 4, 5);
        Integer result = listExamples.getMiddleAndPlusTwo(nums);
        Integer result1 = listExamples.getMiddleAndPlusTwo(nums1);
        assertEquals(50, result);
        assertEquals(5, result1);
    }

    @Test
    void findEvenNumbers() {
        List<Integer> nums = List.of(10, 20, 30, 55, 37);
        List<Integer> nums1 = List.of(10, 20, 30, 40, 17);
        List<Integer> n1 = List.of(10, 20, 30);
        List<Integer> n2 = List.of(10, 20, 30, 40);
        List<Integer> result = listExamples.findEvenNumbers(nums);
        List<Integer> result1 = listExamples.findEvenNumbers(nums1);
        assertEquals(n1, result);
        assertEquals(n2, result1);
    }

    @Test
    void findOddNumbers() {
        List<Integer> nums = List.of(10, 20, 11, 55, 37);
        List<Integer> nums1 = List.of(7, 20, 77, 40, 17);
        List<Integer> n1 = List.of(11, 55, 37);
        List<Integer> n2 = List.of(7, 77, 17);
        List<Integer> result = listExamples.findOddNumbers(nums);
        List<Integer> result1 = listExamples.findOddNumbers(nums1);
        assertEquals(n1, result);
        assertEquals(n2, result1);
    }

    @Test
    void secondMaximum() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(10);
        numbers1.add(20);
        numbers1.add(50);
        numbers1.add(60);
        numbers1.add(70);
        Integer answer = listExamples.secondMaximum(numbers);
        Integer answer1 = listExamples.secondMaximum(numbers1);
        assertEquals(40, answer);
        assertEquals(60, answer1);
    }

    @Test
    void concatenation() {
        List<String> names = List.of("shikha", "bruno", "kallu");
        List<String> names1 = List.of("");
        String string1 = "shikhabrunokallu";
        String string2 = "";
        String s = listExamples.concatenation(names);
        String n = listExamples.concatenation(names1);
        assertEquals(string1, s);
        assertEquals(string2, n);
    }

    @Test
    void search() {
        List<Integer> nums = List.of(10, 5, 3, 40, 50);
        List<Integer> nums1 = List.of(40, 50, 60, 70);
        Boolean answer = listExamples.search(nums, 50);
        Boolean answer1 = listExamples.search(nums1, 70);
        assertTrue(answer);
        assertTrue(answer1);
    }

    @BeforeEach
    void setUp() {
    }

    @Test
    void movesAllZeroesToEnd() {
        List<Integer> nums = List.of(1, 0, 5, 3, 0, 40, 0, 50, 0);
        List<Integer> nums1 = List.of(0, 40, 0, 50, 0, 60, 0, 70, 0);
        List<Integer> endsWithZero = List.of(1, 5, 3, 40, 50, 0, 0, 0, 0);
        List<Integer> endsWithZero1 = List.of(40, 50, 60, 70, 0, 0, 0, 0, 0);
        List<Integer> answer = listExamples.movesAllZeroesToEnd(nums);
        List<Integer> answer1 = listExamples.movesAllZeroesToEnd(nums1);
        assertEquals(endsWithZero, answer);
        assertEquals(endsWithZero1, answer1);
    }

    @Test
    void segregateEvenAndOdd() {
        List<Integer> numbers = List.of(20, 77, 40, 60, 11, 66, 51, 99, 14, 2);
        List<Integer> numbers1 = List.of(2, 11, 1, 4, 20, 3, 6, 5, 8, 7, 10, 9);
        List<Integer> rearrangedList = List.of(20, 40, 60, 66, 14, 2, 77, 11, 51, 99);
        List<Integer> rearrangedList1 = List.of(2, 4, 20, 6, 8, 10, 11, 1, 3, 5, 7, 9);
        List<Integer> result = listExamples.segregateEvenAndOdd(numbers);
        List<Integer> result1 = listExamples.segregateEvenAndOdd(numbers1);
        assertEquals(rearrangedList, result);
        assertEquals(rearrangedList1, result1);
    }

    @Test
    void leftRotate() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> numbers1 = List.of(4, 5, 6, 3, 7, 9);
        List<Integer> rotatedList = List.of(3, 4, 5, 6, 1, 2);
        List<Integer> rotatedList1 = List.of(2, 1, 3, 4, 5, 6);
        List<Integer> result = listExamples.leftRotate(numbers);
        List<Integer> result1 = listExamples.leftRotate(numbers1);
        assertEquals(rotatedList, result);
        assertEquals(rotatedList1, result1);
    }


    @Test
    void findSingleElement() {
        List<Integer> numbers = List.of(1, 1, 2, 2, 3, 4, 4, 5, 5);
        List<Integer> numbers1 = List.of(1, 1, 2, 2, 3, 3, 4, 4, 5);
        Integer expexted = 3;
        Integer expexted1 = 5;
        Integer result = listExamples.findSingleElement(numbers);
        Integer result1 = listExamples.findSingleElement(numbers1);
        assertEquals(3, result);
        assertEquals(5, result1);
    }

    @Test
    void sorting() {
        List<Integer> numbers = List.of(1, 5, 6, 7, 8, 9, 2, 3, 4, 10);
        List<Integer> numbers1 = List.of(1, 4, 3, 2, 6, 5, 7, 9, 8, 10);
        List<Integer> answer = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> answer1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = listExamples.sorting(numbers);
        List<Integer> result1 = listExamples.sorting(numbers1);
        assertEquals(answer, result);
        assertEquals(answer1, result1);
    }

    @Test
    void findUnique() {
        List<Integer> numbers = List.of(1, 5, 6, 6, 8, 7, 7, 8, 9, 2, 3, 4, 10);
        List<Integer> result = List.of(1, 5, 6, 8, 7, 9, 2, 3, 4, 10);
        List<Integer> answer = listExamples.findUnique(numbers);
        assertEquals(result,answer);
    }

    @Test
    void twoSum() {
        List<Integer> numbers = List.of(1,2,3,4,5);
        Integer sum = 7;
        Boolean answer = listExamples.twoSum(numbers,7);
        assertTrue(answer);


    }

    @Test
    void fruitsCount() {
        List<String> fruits = List.of("apple", "banana", "banana", "orange", "apple", "banana", "orange", "kiwi");
        Map<String, Integer> expectedCount1 = Map.of("apple", 2, "banana", 3, "orange", 2, "kiwi",1);
        Map<String, Integer> result = listExamples.fruitsCount(fruits);
        assertEquals(expectedCount1, result);
    }
}

