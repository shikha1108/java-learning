package org.example;

public class StringExamples {

    public String reverse(String str) {
        String reverse = "";
        for(Character c : str.toCharArray()) {
            reverse = c + reverse;
        }
        return reverse;
    }

}
