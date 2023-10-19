package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    void findSecondLargest1() {
        List<Integer> nums = List.of(10, 20, 30, 40, 50);
        Integer result = listExamples.findSecondLargest1(nums);
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
        List<Integer> numbers = List.of(10, 20, 30, 40);
        List<Integer> numbers1 = List.of(1, 2, 3, 4);
        Integer result = listExamples.findMaximum(numbers);
        Integer result1 = listExamples.findMaximum(numbers1);
        assertEquals(40, result);
        assertEquals(4, result1);
    }

    @Test
    void findMinimum() {
        List<Integer> nums = List.of(10, 20, 30, 40, 50);
        List<Integer> nums1 = List.of(20, 30, 40, 50);
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
    void findMiddle() {
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
    void secondLast() {
        List<Integer> nums = List.of(10, 20, 30, 40);
        List<Integer> nums1 = List.of(1, 2, 3, 4);
        Integer answer = listExamples.secondLast(nums);
        Integer answer1 = listExamples.secondLast(nums1);
        assertEquals(30, answer);
        assertEquals(3, answer1);
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
        List<Integer> nums = new ArrayList<>(List.of(10, 20, 11, 55, 37));
        List<Integer> nums1 = new ArrayList<>(List.of(7, 20, 77, 40, 17));
        Integer answer = listExamples.secondMaximum(nums);
        assertEquals(37, answer);
        Integer answer1 = listExamples.secondMaximum(nums1);
        assertEquals(40, answer1);
    }

    @Test
    void addString() {
        List<String> names = List.of("shikha", "bruno", "kallu");
        List<String> names1 = List.of("");
        String string1 = "shikhabrunokallu";
        String string2 = "";
        String s = listExamples.addString(names);
        String n = listExamples.addString(names1);
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
}

