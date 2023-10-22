package org.example;

import java.util.*;

public class MapExamples {

    public Boolean findKey(Map<String, Integer> fruits, String key) {
        Boolean result = false;
        for (Map.Entry<String, Integer> e : fruits.entrySet()) {
            if (e.getKey().equals(key)) {
                result = true;
            }
        }
        return result;
    }

    public Integer sum(Map<String, Integer> fruits) {
        Integer sum = 0;
        for (Map.Entry<String, Integer> e : fruits.entrySet()) {
            sum = sum + e.getValue();
        }
        return sum;
    }

    public List<String> keyOfString(Map<String, Integer> nums) {
        List<String> numbers = new ArrayList<>();
        Collections.sort(numbers);
        for (Map.Entry<String, Integer> e : nums.entrySet()) {
            String result = e.getKey();
            numbers.add(result);
        }
        return numbers;
    }
//count fruit number count fruits in a list of fruits.

}
