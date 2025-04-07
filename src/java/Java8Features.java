package src.java;

import java.util.*;
import java.util.function.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Features {
    public static void main(String[] args) {
// 1. Lambda Expressions
        demonstrateLambdaExpressions();

// 2. Method References
        demonstrateMethodReferences();

// 3. Stream API
        demonstrateStreamAPI();

// 4. Optional Class
        demonstrateOptionalClass();

// 5. New Date and Time API
        demonstrateDateAndTimeAPI();

// 6. Default and Static Methods in Interfaces
        demonstrateInterfaceMethods();

// 7. Functional Interfaces
        demonstrateFunctionalInterfaces();
    }

    // 1. Lambda Expressions
    private static void demonstrateLambdaExpressions() {
        System.out.println("\n1. Lambda Expressions:");

// Traditional approach
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

// Lambda expression approach
        Collections.sort(names, (a, b) -> b.compareTo(a));

// Printing sorted list
        names.forEach(name -> System.out.println(name));
    }

    // 2. Method References
    private static void demonstrateMethodReferences() {
        System.out.println("\n2. Method References:");

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

// Static method reference
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

// Instance method reference
        names.stream()
                .sorted(String::compareToIgnoreCase)
                .forEach(System.out::println);
    }

    // 3. Stream API
    private static void demonstrateStreamAPI() {
        System.out.println("\n3. Stream API:");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

// Map and reduce
        int sum = numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println("Sum of squares: " + sum);
    }

    // 4. Optional Class
    private static void demonstrateOptionalClass() {
        System.out.println("\n4. Optional Class:");

        Optional<String> emptyOptional = Optional.empty();
        Optional<String> nameOptional = Optional.of("John");

// Checking and getting value
        System.out.println("Is empty? " + emptyOptional.isEmpty());
        System.out.println("Name present: " + nameOptional.isPresent());

// Providing a default value
        String name = nameOptional.orElse("Unknown");
        System.out.println("Name: " + name);

// Conditional action
        nameOptional.ifPresent(n -> System.out.println("Hello, " + n));
    }

    // 5. New Date and Time API
    private static void demonstrateDateAndTimeAPI() {
        System.out.println("\n5. New Date and Time API:");

// Current date and time
        LocalDate today = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Today: " + today);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current DateTime: " + currentDateTime);

// Parsing and formatting
        LocalDate parsedDate = LocalDate.parse("2023-12-31");
        String formattedDate = parsedDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Formatted Date: " + formattedDate);
    }

    // 6. Default and Static Methods in Interfaces
    interface Greeting {
        // Default method
        default void printGreeting() {
            System.out.println("Hello from default method!");
        }

        // Static method
        static void staticGreetingMethod() {
            System.out.println("Greeting from static method!");
        }

        // Abstract method
        void greet(String name);
    }

    private static void demonstrateInterfaceMethods() {
        System.out.println("\n6. Default and Static Methods in Interfaces:");

        Greeting greeting = name -> System.out.println("Hello, " + name);
        greeting.greet("World");
        greeting.printGreeting();
        Greeting.staticGreetingMethod();
    }

    // 7. Functional Interfaces
    private static void demonstrateFunctionalInterfaces() {
        System.out.println("\n7. Functional Interfaces:");

// Predicate - takes an input and returns a boolean
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

// Function - takes an input and produces an output
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));

// Supplier - provides a value
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random number: " + randomSupplier.get());

// Consumer - accepts an input and does something with it
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("Printing with Consumer");
    }
}
