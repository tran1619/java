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

        // System.out.println("Total Sum: " + totalValues(numbers, e -> true));
        // System.out.println("Total of Even Numbers: " +totalValues(numbers, e -> e % 2 == 0));
        // System.out.println("Total of Odd Numbers: " +totalValues(numbers, e -> e % 2 != 0));
        // System.out.println("Total of value greater than 5: " + totalValues(numbers, e -> e > 5));

        // sorted list
        final List<String> personOlderThan30 =
        people.stream()
              .filter(p -> p.getAge() > 30)
              .map(Person::getName)
              .collect(toList());

        System.out.println(personOlderThan30);
   }
}