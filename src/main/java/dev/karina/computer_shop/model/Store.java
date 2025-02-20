package dev.karina.computer_shop.model;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String name;
    private String owner;
    private String taxId;
    private List<Computer> computers;

    public Store(String name, String owner, String taxId) {
        this.name = name;
        this.owner = owner;
        this.taxId = taxId;
        this.computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public boolean deleteComputerByBrand(String brand) {
        return computers.removeIf(c -> c.getBrand().equalsIgnoreCase(brand));
    }

    public List<Computer> searchComputerByBrand(String brand) {
        List<Computer> result = new ArrayList<>();
        for (Computer c : computers) {
            if (c.getBrand().equalsIgnoreCase(brand)) {
                result.add(c);
            }
        }
        return result;
    }

    public List<Computer> listComputers() {
        return new ArrayList<>(computers);
    }
}
