package com.pluralsight.ComparableVsComparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class CompareDemo {
    public static void main(String[] args) {
        Course math = new Course("Algebra", 120, 50);
        Course bio = new Course("Marine Bio", 160, 60);
        Course tech = new Course("Computers", 150, 80);

        List<Course> courseList = List.of(math, bio, tech);

        courseList.stream()
                .sorted((course1, course2) -> (int) (course1.getStudyPoints() - course2.getStudyPoints()))
                .forEach(c -> System.out.println("Courses Sorted By Study Points: " + c.getTitle()));

        courseList.stream()
                .sorted((course1, course2) -> (int) (course1.getMaxSize() - course2.getMaxSize()))
                .forEach(c -> System.out.println("Courses Sorted By Max Size: " + c.getTitle()));

        courseList.stream()
                .sorted(Comparator.comparing(Course::getTitle).reversed())
                .forEach(c -> System.out.println(c.getTitle()));

    }
}