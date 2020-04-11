import java.util.*;

class Sample {
    public static void main(final String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
            .filter(e -> e % 2 == 0)
            .forEach(System.out::println);
    }
}