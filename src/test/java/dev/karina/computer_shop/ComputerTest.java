package dev.karina.computer_shop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ComputerTest {
    @Test
    void testComputer(){
        Computer computer = new Computer("MackBook Pro", 16, "Intel Core i7", "MacOs Monterey", 700);

        assertEquals("MacBook Pro", computer.getBrand());
        assertEquals(16, computer.getMemory());
        assertEquals("Intel Core i7", computer.getProcessor());
        assertEquals("MacOs Monterey", computer.getOperatingSystem());
        assertEquals(700, computer.getPrice());
    }
}
