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
}