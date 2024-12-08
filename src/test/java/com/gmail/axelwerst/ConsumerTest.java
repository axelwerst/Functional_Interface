package com.gmail.axelwerst;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

class ConsumerTest {

    @Test
    void testGenerateNumbers() {
        List<Integer> result = new ArrayList<>();
        Consumer<Integer> generateNumbers = n -> {
            for (int i = 0; i <= n; i++) {
                result.add(i);
            }
        };

        generateNumbers.accept(5);
        assertEquals(List.of(0, 1, 2, 3, 4, 5), result);
    }
}