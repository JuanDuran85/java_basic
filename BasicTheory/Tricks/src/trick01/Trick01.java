package trick01;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Trick01 {
    // Trick01
    public static void main(String[] args) {
        System.out.println("Java Stream Tricks");
        peakForDebugging();
        generateInfiniteStream();
        faltMapForNestedCollections();
        groupingWithCollectors();
    }

    public static void peakForDebugging() {
        System.out.println("Peek for debugging");
        // Use peek to inspect elements mid-stream without altering the pipeline.
        List<String> names = List.of("John", "Jane", "Bob", "Alice", "Pedro", "Maria", "Juan");
        names.stream().peek(name -> System.out.println("Processing: " + name)).filter(name -> name.startsWith("M")).forEach(System.out::println);
    }

    public static void generateInfiniteStream() {
        System.out.println("Generate Infinite Stream");
        // Create infinite sequences with Stream.generate or Stream.iterate.
        Stream.iterate(0, i -> i + 2).limit(10).forEach(System.out::println);
    }

    public static void faltMapForNestedCollections() {
        System.out.println("FlatMap for nested collections");
        // Flatten nested lists with flatMap.

        List<List<String>> nestedCollection = List.of(List.of("A", "B", "C"), List.of("D", "E", "F"));
        List<String> flatCollection = nestedCollection.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(flatCollection);
    }

    public static void groupingWithCollectors() {
        System.out.println("Grouping with Collectors");
        // Group data by a property using Collectors.groupingBy.
        List<String> wordsToGroup = List.of("sky blue", "red", "green", "blue", "black", "white", "yellow", "orange", "violet", "indigo", "grey", "magenta");
        Map<Character, List<String>> groupedWords = wordsToGroup.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));
        System.out.println(groupedWords);
        groupedWords.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
