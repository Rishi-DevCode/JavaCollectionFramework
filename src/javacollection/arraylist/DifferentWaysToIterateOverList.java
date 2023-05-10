package javacollection.arraylist;

import java.awt.event.ItemEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateOverList {

    public static void main(String[] args) {

        List<String> courses = Arrays.asList("c", "c++", "java", "spring", "Hibernete");
//        basic for loop
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }
//        Enhanced for each loop
        for (String course : courses
        ) {
            System.out.println(courses);
        }
//        basic loop with iterator
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses);
        }
//        iterator with while loop
        Iterator<String> iterator = courses.iterator();
        while (iterator.hasNext()) {
            String type =  (String) iterator.next();
            System.out.println(courses);
        }

        //java 8 stream with lambda example
        courses.stream().forEach(course -> System.out.println(courses));

        // java 8 forEach + lambda expression
        courses.forEach((course)-> System.out.println(course));
    }
}
