package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {


    @Test
    public void shouldAddOneBookUseRepoUseManager() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book first = new Book(1, "A5", 10000, "Pushkin");
        manager.add(first);
        int expected = 1;
        int actual = repo.findALL().length;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddOneSmartphoneToRepoUseManager() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Smartphone first = new Smartphone(1, "A5", 10000, "samsung");
        manager.add(first);
        int expected = 1;
        int actual = repo.findALL().length;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAddOneSmartphoneAndOneBookToRepoUseManager() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Smartphone first = new Smartphone(1, "A5", 10000, "samsung");
        Book second = new Book(1, "A5", 10000, "Pushkin");
        manager.add(first);
        manager.add(second);
        int expected = 2;
        int actual = repo.findALL().length;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSearchOneBookInRepoUseManager() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book second = new Book(1, "A5", 10000, "Pushkin");
        manager.add(second);
        int actual = manager.searchBy("B").length;
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSearchOneBookInRepoUseManager() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book first = new Book(1, "A4", 2000, "Pushkin");
        Book second = new Book(1, "A5", 10000, "Pushkin");
        manager.add((first));
        manager.add(second);
        int actual = manager.searchBy("A5").length;
        int expected = 1;
        assertEquals(expected, actual);
    }

}