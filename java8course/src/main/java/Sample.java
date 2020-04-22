package java8course.src.main.java;

import java.util.*;
import java.util.function.*;
import static java.util.stream.Collectors.*;

class Sample {
    
    public static List<Person> createPeople() {
        return Arrays.asList(
            new Person("Michael", Gender.MALE, 21),
            new Person("Paul", Gender.MALE, 55),
            new Person("Mary", Gender.FEMALE, 33),
            new Person("Robert", Gender.MALE, 24),
            new Person("Suzy", Gender.FEMALE, 18)
        );
    }

    public static int totalValues (final List<Integer> numbers, final Predicate<Integer> selector) {
        return numbers.stream()
                      .filter(selector)
                      .reduce(0, (c, e) -> c + e);
    }


    public static void main(final String[] args) {
        final List<Person> people = createPeople();

        // find all female person
        final Map<String, Integer> personOlderThan30 =
        people.stream()
                .filter(person -> person.getGender() == Gender.FEMALE)
                .collect(toMap(Person::getName, Person::getAge));

        System.out.println(personOlderThan30);
   }
}