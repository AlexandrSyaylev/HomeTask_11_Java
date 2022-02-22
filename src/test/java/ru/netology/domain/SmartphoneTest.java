package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    @Test
    void shouldSetAndGetManufacturer() {
        Smartphone first = new Smartphone(1, "A5", 10000, "samsung");
        first.setManufacturer("Nokla");
        String expected = "Nokla";
        String actual = first.getManufacturer();
        assertEquals(expected, actual);
    }

    @Test
    void testEquals() {
        Smartphone first = new Smartphone(1, "A5", 10000, "samsung");
        Smartphone second = new Smartphone(1, "A5", 10000, "samsung");
        assertEquals(first, second);
    }
}