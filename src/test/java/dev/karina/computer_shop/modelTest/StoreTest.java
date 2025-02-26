package dev.karina.computer_shop.modelTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.karina.computer_shop.controller.StoreController;
import dev.karina.computer_shop.model.Computer;
import dev.karina.computer_shop.model.Store;

public class StoreTest {
    private Store store;
    private StoreController controller;

    @BeforeEach
    void setUp() {
        store = new Store("Computer Store", "Jeremih Reyes", "0123453M");
        controller = new StoreController(store);
    }

    @Test
    void testStoreAttributes() {
        assertEquals("Computer Store", store.getName());
        assertEquals("Jeremih Reyes", store.getOwner());
        assertEquals("0123453M", store.getTaxId());
    }

    @Test
    void testAddComputer() {
        Computer computer = new Computer("MacBook Pro", 16, "Intel Core i7", "MacOs Monterey", 700);
        controller.addComputer(computer);

        List<Computer> computers = controller.listComputers();
        assertEquals(1, computers.size());
        assertEquals("MacBook Pro", computers.get(0).getBrand());
    }

    @Test
    void testDeleteComputerByBrand() {
        Computer computer1 = new Computer("MacBook Pro 14", 24, "Chip M4", "MacOs Ventura", 2449);
        Computer computer2 = new Computer("MacBook Pro 16", 24, "Chip M6", "MacOs Ventura", 2949);
        controller.addComputer(computer1);
        controller.addComputer(computer2);

        boolean removed = controller.deleteComputerByBrand("MacBook Pro 14");
        assertTrue(removed);
        assertEquals(1, controller.listComputers().size());
    }

    @Test
    void testSearchComputerByBrand() {
        Computer computer1 = new Computer("Dell Precission", 16, "Intel i7", "Windows 10", 1800);
        controller.addComputer(computer1);

        List<Computer> foundComputers = controller.searchComputerByBrand("Dell Precission");
        assertEquals(1, foundComputers.size());
        assertEquals("Dell Precission", foundComputers.get(0).getBrand());
    }

    @Test
    void testListComputers() {
        controller.addComputer(new Computer("MacBook Pro", 16, "Chip M2", "MacOs Ventura", 1800));
        controller.addComputer(new Computer("iMac", 16, "Chip M4", "MacOs Sononma", 1800));

        List<Computer> computers = controller.listComputers();
        assertEquals(2, computers.size());
    }
}
