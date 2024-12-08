package com.gmail.axelwerst;

import org.junit.jupiter.api.Test;
import java.util.function.Predicate;
import static org.junit.jupiter.api.Assertions.*;

class PredicateTest {

    @Test
    void testIsPrime() {
        Predicate<Integer> isPrime = n -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        };
        assertTrue(isPrime.test(17));
        assertFalse(isPrime.test(18));
        assertFalse(isPrime.test(1));
        assertFalse(isPrime.test(0));
        assertTrue(isPrime.test(2));
    }
}