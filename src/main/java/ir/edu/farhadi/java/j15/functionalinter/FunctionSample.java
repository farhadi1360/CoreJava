package ir.edu.farhadi.java.j15.functionalinter;

import ir.edu.farhadi.java.j15.functionalinter.basic.PersonEntity;
import ir.edu.farhadi.java.j15.functionalinter.basic.PersonModel;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * create some samples just for showing how we can use functional interfaces in java 8
 * we talk about these concepts
 * Function
 * Consumer
 * Predicate
 * Supplier
 */
public class FunctionSample {
    public static void main(String[] args) {
//        sampleForFunction();
//        sampleForUsingConsuming();
//        samplesForUsingPredicate();
//        sampleForUsingSupplier();
//        lazyInitializationExample1();
        lazyInitializationExample2();
    }

    public static void sampleForFunction() {
        /**
         * public interface Function<T, R> { … }
         */
//        Function<Integer, Integer> doubleFunction = (num) -> num * 2;
//        int result = doubleFunction.apply(5);
//        System.out.println(result);
//
//        Function<Integer, String> intToString = i -> String.valueOf(i);
//        String result2 = intToString.apply(1500);
//        System.out.println(result2);
//
//        Function<PersonEntity, PersonModel> entityToModel = entity -> new PersonModel(entity.getFirstName(), entity.getLaseName());
//        PersonModel personModel = entityToModel.apply(new PersonEntity("Mostafa", "Farhadi"));
//        System.out.println(personModel);

//        Function<String, Integer> stringToInt = s -> s.length();
//        Function<Integer, Long> intToLong = i -> i.longValue();
//        Function<String, Long> stringToLong = stringToInt.andThen(intToLong);
//        Long rs = stringToLong.apply("1500");
//        System.out.println(rs);

//        Function<Integer, Integer> f1 = x -> x * 2;
//        Function<Integer, Integer> f2 = x -> x + 3;
//        Function<Integer, Integer> f3 = f1.andThen(f2);
//        Integer result = f3.apply(5);  // Output: 13
//        System.out.println(result);
//
//        Function<Integer, Integer> f1 = x -> x * 2;
//        Function<Integer, Integer> f2 = x -> x + 3;
//        Function<Integer, Integer> composed = f1.compose(f2);
//        Integer result = composed.apply(5); // Output: 16
//        System.out.println(result);
    }

    public static void sampleForUsingConsuming() {
        /**
         * The consumer interface of the functional interface is the one that accepts only one argument
         * The consumer interface has no return value.
         */
//        Consumer<String> print = x -> System.out.println(x);
//        print.accept("Mostafa Farhadi");

//        Consumer<String> toUpperCase = x -> System.out.println(x.toUpperCase());
//        toUpperCase.accept("hello");

        Consumer<Integer> multiplyBy5 = x -> System.out.println(5 * x);
        multiplyBy5.accept(4);
    }

    public static void samplesForUsingPredicate() {
        /**
         * In Java 8, the Predicate interface is a functional interface that represents a function that takes in an argument and returns a boolean value.
         */
//        Predicate<Integer> noGreaterThan5 = x -> x > 5;
//        System.out.println(noGreaterThan5.test(2));

        Predicate<PersonEntity> isMostafa = e -> "Mostafa".equalsIgnoreCase(e.getFirstName());
        Predicate<PersonEntity> isFarhadi = e -> "Farhadi".equalsIgnoreCase(e.getLaseName());
        Predicate<PersonEntity> isMostafaFarhadi = isMostafa.and(isFarhadi);
//
////        // test just for name
//        if (isMostafa.test(new PersonEntity("Mostafa", "Farhadi"))){
//            System.out.println("yes the Name is Mostafa");
//        }else{
//            System.out.println("No the Name is not Mostafa");
//        }
//        // test just for family
//        if (isFarhadi.test(new PersonEntity("Mostafa", "Farhadi"))){
//            System.out.println("yes the Family is Farhadi");
//        }else{
//            System.out.println("No the Family is Not Farhadi");
//        }
//
//        // // test just for name and family
//        if (isMostafaFarhadi.test(new PersonEntity("Mostafa", "Farhadi"))){
//            System.out.println("yes the Name is Mostafa");
//        }else{
//            System.out.println("No the Name is not Mostafa");
//        }
//

//
//        List<String> names = Arrays.asList(
//                "Mostafa", "Javad", "Mahan", "Shervin", "Hesam");
//        Predicate<String> p = (s) -> s.startsWith("M");
//        for (String st : names) {
//            if (p.test(st))
//                System.out.println(st);
//        }


    }


    public static void sampleForUsingSupplier() {
        /**
         * The Supplier functional interface is also a type of functional interface that does not take any input or argument and yet returns a single output.
         */
//        Supplier<String> supplier = () -> "Hello, World!";
//        String result = supplier.get();
//        System.out.println(result); // Output: Hello, World!

//        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(100);
//        int randomNumber = randomNumberSupplier.get();
//        System.out.println(randomNumber); // Output: A random number between 0 and 99


    }

    public static void lazyInitializationExample1 (){
        class LazyInitializationExample {
            private Supplier<String> lazyValue = () -> {
                // Perform expensive initialization here
                return "Lazy Value";
            };

            public String getValue() {
                return lazyValue.get();
            }
        }

        LazyInitializationExample example = new LazyInitializationExample();
        String value = example.getValue(); // Expensive initialization is performed only when needed
        System.out.println(value); // Output: Lazy Value

        }

    public static void lazyInitializationExample2 (){
        Supplier<PersonEntity> expensiveObjectSupplier = () -> {
            // Perform expensive initialization logic here
            return new PersonEntity("Mostafa","Farhadi");
        };
        PersonEntity expensiveObjectOfPersonEntity = lazyInitialize(expensiveObjectSupplier);

        System.out.println(expensiveObjectOfPersonEntity.getFirstName());
    }
    private static <T> T lazyInitialize(Supplier<T> supplier) {
        return supplier.get();
    }


}
