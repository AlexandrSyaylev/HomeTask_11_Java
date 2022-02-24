package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);
    Book first = new Book(1, "A4", 2000, "Pushkin");
    Book second = new Book(1, "A5", 10000, "Pushkin");
    Smartphone firstSmartphone = new Smartphone(1, "A5", 10000, "samsung");

    @Test
    public void shouldAddOneBookUseRepoUseManager() {
        manager.add(first);
        Product[] expected = {first};
        Product[] actual = repo.findALL();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneSmartphoneToRepoUseManager() {
        manager.add(firstSmartphone);
        Product[] expected = {firstSmartphone};
        Product[] actual = repo.findALL();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneSmartphoneAndOneBookToRepoUseManager() {
        manager.add(firstSmartphone);
        manager.add(second);
        Product[] expected = {firstSmartphone, second};
        Product[] actual = repo.findALL();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotSearchOneBookInRepoUseManager() {
        manager.add(second);
        int actual = manager.searchBy("B").length;
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSearchOneBookInRepoUseManager() {
        manager.add(first);
        manager.add(second);
        Product[] actual = manager.searchBy("A5");
        Product[] expected = {second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSeekTwoBookInRepoUseManager() {
        manager.add(first);
        manager.add(second);
        Product[] actual = manager.searchBy("A");
        Product[] expected = {first, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldCompareTwoBooksInRepoUseManager() {
        manager.add(first);
        manager.add(second);
        Product[] actual = manager.searchBy("A5");
        Product[] expected = {second};
        assertArrayEquals(expected, actual);
    }

}