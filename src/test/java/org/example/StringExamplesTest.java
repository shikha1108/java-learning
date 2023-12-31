package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringExamplesTest {

    private StringExamples stringExamples = new StringExamples();
    @Test
    void reverse() {
        String str = "abc";
        String reverse = "cba";
        assertEquals(reverse, stringExamples.reverse(str));
    }

    @Test
    void palindrome() {
        String str = "bob";
        Boolean result = true;
        assertEquals(result, stringExamples.palindrome(str));
    }
}