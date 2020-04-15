import java.util.*;
import java.util.function.Predicate;

class Sample {
    
    public static int totalValues (List<Integer> numbers,
    Predicate<Integer> selector) {
        return numbers.stream()
                      .filter(selector)
                      .reduce(0, (c, e) -> c + e);
    }

    public static void main(final String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Total Sum: " + totalValues(numbers, e -> true));
        System.out.println("Total of Even Numbers: " +totalValues(numbers, e -> e % 2 == 0));
        System.out.println("Total of Odd Numbers: " +totalValues(numbers, e -> e % 2 != 0));
//      numbers.forEach(System.out::println);
    }
}