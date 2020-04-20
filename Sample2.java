import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.lang.Integer;

class Sample2 {
    public static void main(final String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 23, 22, 24, 1, 2);

final Map<Integer, Integer> intCount = numbers
        .stream()
        .collect(Map.containsKey(e), ));

System.out.println(intCount);
                
}
}