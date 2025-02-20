package dev.karina.computer_shop.modelTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import dev.karina.computer_shop.model.Computer;

public class ComputerTest {
    @Test
    void testComputer() {
        Computer computer = new Computer("MacBook Pro", 16, "Intel Core i7", "MacOs Monterey", 700);

        assertEquals("MacBook Pro", computer.getBrand());
        assertEquals(16, computer.getMemory());
        assertEquals("Intel Core i7", computer.getProcessor());
        assertEquals("MacOs Monterey", computer.getOperatingSystem());
        assertEquals(700, computer.getPrice());
    }
}
