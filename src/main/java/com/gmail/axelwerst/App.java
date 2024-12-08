package com.gmail.axelwerst;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.*;

public class App {
    public static void main(String[] args) {

        Predicate<Integer> isPrime = n -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        System.out.println(isPrime.test(17));
        System.out.println(isPrime.test(63));
        System.out.println(isPrime.test(997));

        Consumer<Integer> generateAndPrintRandom = upperBound -> {
            Random random = new Random();
            int randomNumber = random.nextInt(upperBound + 1);
            System.out.println("Generated number: " + randomNumber);
        };
        generateAndPrintRandom.accept(10);
        generateAndPrintRandom.accept(25);

        Supplier<String> dayOfWeek = () -> LocalDate.now().getDayOfWeek().toString();
        System.out.println(dayOfWeek.get());

        Function<Double, Long> roundToLong = Math::round;

        System.out.println(roundToLong.apply(5.8));
        System.out.println(roundToLong.apply(2.3));

        UnaryOperator<Integer> fibonacci = n -> {
            if (n <= 1) return n;
            int a = 0, b = 1, temp;
            for (int i = 2; i <= n; i++) {
                temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        };

        System.out.println(fibonacci.apply(10));
        System.out.println(fibonacci.apply(15));


    }
}





