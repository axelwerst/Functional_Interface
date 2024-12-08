package com.gmail.axelwerst;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class SupplierTest {

    @Test
    void testDayOfWeek() {
        Supplier<String> dayOfWeek = () -> LocalDate.now().getDayOfWeek().toString();

        String expected = LocalDate.now().getDayOfWeek().toString();
        assertEquals(expected, dayOfWeek.get());
    }
}