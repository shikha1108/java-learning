package org.example;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExamples {

    public Set<Integer> removeDuplicate(List<Integer> nums) {
        Set<Integer> numbers = new HashSet<>();
        for (Integer num : nums) {
            if (!numbers.contains(num)) {
                numbers.add(num);
            }
        }
        return numbers;
    }
}
