package org.example;

import org.example.service.StudentService;
import org.example.util.PragraUtils;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        // builder

        StudentService service = new StudentService();
//        service.processStudentById(50);

//        Predicate<String> filterNames = s -> s.length()>4;
//        Stream<String> nameStream = Stream.generate(() -> "Divyanshu");
//        Stream<String> filteredStream = nameStream.filter(s -> s.length() > 4);
//        Stream<String> stringStream = filteredStream.filter(s -> s.startsWith("Di"));

        // s1,s2,s3,s4,s5

//        Stream.generate(() -> "Divyanshu")
//                .filter(s -> s.length() > 4)
//                .filter(s -> s.startsWith("Di"))
//                .filter(s -> s.endsWith("u"))
//                .filter(a -> a.length()>6);
//
//
//        List<Integer> grades = new ArrayList<>(List.of(12,43,56,78,54,67,98,57,86,76,45,76,89,99,55,77,88,44,55,66,77,77,77,77,77));
//        PragraUtils utils = new PragraUtils();
//
//        System.out.println(grades);
//        List<String> collected = grades
//                .parallelStream()//12,43,56,78,54,67,98,57,86,76
//                .filter(utils::filterOddNumber)//43,67,57,45,.. //Predicate<Integer>// ::
//                .filter(n -> n % 11 == 0)//99,55,77,44,55,66,77,77,77,..
//                .map(String::valueOf)//"99","55","77",..
//                .sorted() // comparator
//                .distinct() // 55,77,99
//                .collect(Collectors.toList());
//
//        long count = grades
//                .parallelStream()//12,43,56,78,54,67,98,57,86,76
//                .filter(n -> n % 2 != 0)//43,67,57,45,..
//                .filter(n -> n % 11 == 0)//99,55,77,44,55,66,77,77,77,..
//                .map(a -> String.valueOf(a))//"99","55","77",..
//                .sorted() // comparator
//                .distinct() // 55,77,99
//                .count();
//
//        Optional<Object> o = Optional.empty();
//
//
//
//        // findFirst // findAny
//
//        grades
//                .parallelStream()//12,43,56,78,54,67,98,57,86,76
//                .filter(utils::filterOddNumber)
//                .forEach(System.out::println);
        // println mehtod-> doesn't return anything & accepts only 1 arg

        Student s1 = Student
                .builder()
                .emails(new ArrayList<>(List.of("patel.shubh@gmail.com","shubh.patal@gmail.com","s.pragra@gmail.com")))
                .firstName("Shubham")
                .lastName("Patel")
                .build();
        Student s2 = Student
                .builder()
                .emails(new ArrayList<>(List.of("s.vrunda@gmail.com","vrunda.s@gmail.com","v.pragra@gmail.com")))
                .firstName("Vrunda")
                .lastName("S")
                .build();
        Student s3 = Student
                .builder()
                .emails(new ArrayList<>(List.of("s.Divyanshu@gmail.com","Divyanshu.s@gmail.com","d.pragra@gmail.com")))
                .firstName("Divyanshu")
                .lastName("S")
                .build();
        Student s4 = Student
                .builder()
                .emails(new ArrayList<>(List.of("g.Jatin@gmail.com","Jatin.g@gmail.com","j.pragra@gmail.com")))
                .firstName("Jatin")
                .lastName("G")
                .build();
        List<Student> candidates = new ArrayList<>(List.of(s1,s2,s3,s4,s2,s3,s1,s4));


        // dataset of dataset -> flatten that dataset -> flatmap
        // collection of collection -> emails - > flatmap
        candidates
                .stream()
                .filter(s -> "S".equals(s.getLastName()))
                .flatMap(s -> s.getEmails().stream())
                // from stream of student -> stream of string
                .forEach(data -> System.out.println(data));

        List<Integer> grades = new ArrayList<>(List.of(12,43,56,78,54,67,98,57,86,76,45,76,89,99,55,77,88,44,55,66,77,77,77,77,77));

        // arith -> reduce

        Integer reduce = grades
                .stream()
                .filter(n -> n % 2 != 0)
                .reduce(0, (a, b) -> a + b);


        boolean b = grades.stream().allMatch(n -> n % 2 != 0);

    }
}