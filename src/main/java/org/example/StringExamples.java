package org.example;

public class StringExamples {

    public String reverse(String str) {
        String reverse = "";
        for(Character c : str.toCharArray()) {
            reverse = c + reverse;
        }
        return reverse;
    }

    public Boolean palindrome(String input) {
        Boolean result = false;
        String reverse = reverse(input);
        if(reverse.equals(input)) {
            result = true;
        }
        return result;
    }

}
