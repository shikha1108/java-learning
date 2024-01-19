package org.example.functional.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> even = numbers.stream().filter(num -> num % 2 == 0).toList(); //used predicate
        even.forEach(num -> System.out.println(num)); //used consumer
        List<Integer> newList = even.stream().map(num -> 10 * num).toList();
        newList.forEach(num -> System.out.println(num));

        //predicate = lambda(T -> Boolean)
        //consumer = lambda(T -> void)
        //supplier = lambda(() -> T )
        //function = lambda(T -> U)
    }

}
