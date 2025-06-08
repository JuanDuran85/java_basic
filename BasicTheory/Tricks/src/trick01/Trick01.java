package trick01;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
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
        partitioningForBooleanConditions();
        customCollectors();
        TakeDropWhileForConditionalSlicing();
        parallelStreamWithCaution();
        streamOfOptionalValues();
        teeingCollectorForMultipleReductions();
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
        List<String> flatCollection = nestedCollection.stream().flatMap(List::stream).toList();
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


    public static void partitioningForBooleanConditions() {
        System.out.println("Partitioning for boolean conditions");
        // Split data into true/false groups with Collectors.partitioningBy.
        List<Integer> numberToWork = List.of(3, 6, 9, 5, 3, 1, 0, 9, 3, 8);
        Map<Boolean, List<Integer>> partitionedNumbers = numberToWork.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println(partitionedNumbers);
        partitionedNumbers.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public static void customCollectors() {
        System.out.println("Custom Collectors");
        // Create a custom collector for specialized aggregation.

        Collector<String, ?, String> joinWithPrefixCollector = Collector.of(
                StringBuilder::new,
                (sb, s) -> sb.append("-prefix-").append(s),
                StringBuilder::append,
                StringBuilder::toString
        );

        List<String> itemsList = List.of("item1", "item2", "item3");
        String result = itemsList.stream().collect(joinWithPrefixCollector);
        System.out.println(result);
    }

    public static void TakeDropWhileForConditionalSlicing() {
        System.out.println("TakeWhile / DropWhile for conditional slicing");
        // takeWhile and dropWhile let you slice streams based on a condition—perfect for ordered data.
        // Unlike filter, takeWhile stops processing once the condition fails,
        // making it more efficient for large datasets. It’s ideal for scenarios
        // like processing logs until a certain event occurs.

        List<Integer> numberToTakeOrDrop = List.of(1, 6, 3, 8, 9, 2, 0, 4, 3, 1, 6, 7, 1, 3, 8, 9, 4, 6, 5, 6);
        List<Integer> takenNumbers = numberToTakeOrDrop.stream().sorted().takeWhile(num -> num < 4).toList();
        List<Integer> droppedNumbers = numberToTakeOrDrop.stream().sorted().dropWhile(num -> num < 4).toList();
        System.out.println("Taken numbers: " + takenNumbers);
        System.out.println("Dropped numbers: " + droppedNumbers);
    }

    public static void parallelStreamWithCaution() {
        System.out.println("Parallel Stream with caution");
        // Use parallelStream for performance, but ensure thread safety.

        List<Integer> numbersToWork = List.of(2, 4, 3, 5, 1, 6, 7, 9, 8, 0);
        int finalSum = numbersToWork.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + finalSum);
    }

    public static void streamOfOptionalValues() {
        System.out.println("Stream of Optional values");
        // Handle Optional values in a stream with stream().

        List<Optional<String>> optionalsValues = List.of(Optional.of("Z"), Optional.empty(), Optional.of("X"), Optional.empty(), Optional.of("Y"));
        List<String> finalValues = optionalsValues.stream().flatMap(Optional::stream).toList();
        System.out.println(finalValues);
    }

    public static void teeingCollectorForMultipleReductions() {
        System.out.println("Teeing collector for multiple reductions");
        // Collectors.teeing lets you perform two reductions and combine the results.

        List<Integer> numberToWork = List.of(4, 3, 2, 1, 0);
        String finalResult = numberToWork.stream()
                .collect(Collectors.teeing(
                        Collectors.summingInt(Integer::intValue),
                        Collectors.counting(),
                        (finalSum, finalCount) -> "FinalSum: " + finalSum + ", FinalCount: " + finalCount
                ));
        System.out.println(finalResult);
    }
}
