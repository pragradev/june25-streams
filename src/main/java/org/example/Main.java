package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        Predicate<String> filterNames = s -> s.length()>4;
//        Stream<String> nameStream = Stream.generate(() -> "Divyanshu");
//        Stream<String> filteredStream = nameStream.filter(s -> s.length() > 4);
//        Stream<String> stringStream = filteredStream.filter(s -> s.startsWith("Di"));

        // s1,s2,s3,s4,s5

        Stream.generate(() -> "Divyanshu")
                .filter(s -> s.length() > 4)
                .filter(s -> s.startsWith("Di"))
                .filter(s -> s.endsWith("u"))
                .filter(a -> a.length()>6);


        List<Integer> grades = new ArrayList<>(List.of(12,43,56,78,54,67,98,57,86,76,45,76,89,99,55,77,88,44,55,66,77,77,77,77,77));


        System.out.println(grades);
        List<String> collected = grades
                .parallelStream()//12,43,56,78,54,67,98,57,86,76
                .filter(n -> n % 2 != 0)//43,67,57,45,..
                .filter(n -> n % 11 == 0)//99,55,77,44,55,66,77,77,77,..
                .map(a -> String.valueOf(a))//"99","55","77",..
                .sorted() // comparator
                .distinct() // 55,77,99
                .collect(Collectors.toList());

        long count = grades
                .parallelStream()//12,43,56,78,54,67,98,57,86,76
                .filter(n -> n % 2 != 0)//43,67,57,45,..
                .filter(n -> n % 11 == 0)//99,55,77,44,55,66,77,77,77,..
                .map(a -> String.valueOf(a))//"99","55","77",..
                .sorted() // comparator
                .distinct() // 55,77,99
                .count();


        // findFirst // findAny

        System.out.println(collected);
        System.out.println(collected);
        System.out.println(collected);
        System.out.println(collected);
        System.out.println(collected);
        System.out.println(collected);
        System.out.println(collected);




    }
}