package com.gmail.axelwerst;

import org.junit.jupiter.api.Test;
import java.util.function.Function;
import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {

    @Test
    void testRoundToLong() {
        Function<Double, Long> roundToLong = Math::round;

        assertEquals(6L, roundToLong.apply(5.5));
        assertEquals(2L, roundToLong.apply(2.3));
        assertEquals(0L, roundToLong.apply(0.4));
    }
}