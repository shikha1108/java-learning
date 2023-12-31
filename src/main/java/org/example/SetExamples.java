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

    public Set<Integer> findIntersection(Set<Integer> nums1, Set<Integer> nums2) {
        Set<Integer> newSet = new HashSet<>();
        for (Integer num : nums1){
            for (Integer num1 : nums2 ) {
                if(num == num1) {
                    newSet.add(num);
                    newSet.add(num1);
                }
            }
        }
        return newSet;
    }

    public Set<Integer> findIntersaction(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> integerSet = new HashSet<>(set1);
        integerSet.retainAll(set2);
        return integerSet;
    }

    public Set<Integer> findUnion(Set<Integer> nums1, Set<Integer> nums2) {
        Set<Integer> unionSet = new HashSet<>(nums1);
        unionSet.addAll(nums2);
        return unionSet;
    }

    public Set<Integer> findDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        return differenceSet;
    }
}
