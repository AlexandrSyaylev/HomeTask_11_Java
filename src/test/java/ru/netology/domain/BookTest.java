package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void shouldSetAndGetManufacturer() {
        Book first = new Book(1, "first", 500, "pushkin");
        first.setAuthor("Nokla");
        String expected = "Nokla";
        String actual = first.getAuthor();
        assertEquals(expected, actual);
    }

    @Test
    void testEquals() {
        Book first = new Book(1, "first", 500, "pushkin");
        Book second = new Book(1, "first", 500, "pushkin");
        assertEquals(first, second);
    }

}