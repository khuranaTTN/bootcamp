package java8session.Q5;


import java.util.function.*;

public class FunctionalInterfaces {

    public static void main(String[] args) {

        System.out.println("Consumer:");
        Consumer<Integer> display = a -> System.out.println(a);
        display.accept(10);


        System.out.println("\nSupplier:");
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get()+"\n");

        System.out.println("Predicate:");
        Predicate<Integer> lesserthan = i -> (i < 18);
        System.out.println(lesserthan.test(10)+"\n");

        System.out.println("Function:");
        Function<Integer, Integer> doubling = a -> {return (2*a);};
        System.out.println(doubling.apply(5)+"\n");

    }
}