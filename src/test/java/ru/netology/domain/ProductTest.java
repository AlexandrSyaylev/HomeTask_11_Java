package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    public void shouldSetAndGetId() {
        Product first = new Product(1, "first", 100);
        first.setId(10);
        int expected = 10;
        int actual = first.getId();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAndGetPrice() {
        Product first = new Product(1, "first", 100);
        first.setPrice(10);
        int expected = 10;
        int actual = first.getPrice();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetAndGetTitle() {
        Product first = new Product(1, "first", 100);
        first.setTitle("10");
        String expected = "10";
        String actual = first.getTitle();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldUseEqualsProduct() {
        Product first = new Product(1, "first", 100);
        Product second = new Product(1, "first", 100);
        assertEquals(first, second);
    }

}