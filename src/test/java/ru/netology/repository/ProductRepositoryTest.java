package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    @Test
    public void shouldAddOneBookUseRepo() {
        Book first = new Book(1, "A5", 10000, "Pushkin");
        ProductRepository repo = new ProductRepository();
        repo.save(first);
        int expected = 1;
        int actual = repo.findALL().length;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddOneSmartphoneToRepo() {
        Smartphone first = new Smartphone(1, "A5", 10000, "samsung");
        ProductRepository repo = new ProductRepository();
        repo.save(first);
        int expected = 1;
        int actual = repo.findALL().length;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddOneSmartphoneAndOneBookToRepo() {
        Smartphone first = new Smartphone(1, "A5", 10000, "samsung");
        Book second = new Book(1, "A5", 10000, "Pushkin");
        ProductRepository repo = new ProductRepository();
        repo.save(first);
        repo.save(second);
        int expected = 2;
        int actual = repo.findALL().length;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemoveByIdBookFromRepo() {
        Book first = new Book(1, "first", 500, "pushkin");
        Book second = new Book(2, "second", 500, "pushkin");
        ProductRepository repo = new ProductRepository();
        repo.save(first);
        repo.save(second);
        repo.removeById(1);
        int expected = 1;
        int actual = repo.findALL().length;
        assertEquals(expected, actual);

    }

}