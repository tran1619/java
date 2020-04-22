import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

class Sample2 {

    public static void main(final String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 23, 22, 24, 1, 2);

        // count the number times a number exist in the list
        final Map<Integer, Long> integerCount = 
        numbers.stream()
               .collect(groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(integerCount);
                
    }
}