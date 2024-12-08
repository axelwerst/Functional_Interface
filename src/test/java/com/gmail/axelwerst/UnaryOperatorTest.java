package com.gmail.axelwerst;

import org.junit.jupiter.api.Test;

import java.util.function.UnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class UnaryOperatorTest {

    @Test
    void testFibonacci() {
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

        assertEquals(0, fibonacci.apply(0));
        assertEquals(1, fibonacci.apply(1));
        assertEquals(1, fibonacci.apply(2));
        assertEquals(55, fibonacci.apply(10));
        assertEquals(610, fibonacci.apply(15));
    }
}