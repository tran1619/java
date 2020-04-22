import java.util.*;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

class Sample2 {
    public static void main(final String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 23, 22, 24, 1, 2);

        final Map<String, Integer> intCount = 
        numbers.stream()
               .collect(toMap(String::toString));

        System.out.println(intCount);


System.out.println(intCount);
                
}
}