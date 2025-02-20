package dev.karina.computer_shop.model.controller;

import java.util.List;

import dev.karina.computer_shop.model.Computer;
import dev.karina.computer_shop.model.Store;

public class StoreController {
    private Store store;

    public StoreController(Store store) {
        this.store = store;
    }

    public void addComputer(Computer computer) {
        store.addComputer(computer);
    }

    public boolean deleteComputerByBrand(String brand) {
        return store.deleteComputerByBrand(brand);
    }

    public List<Computer> listComputers() {
        return store.listComputers();
    }

}
