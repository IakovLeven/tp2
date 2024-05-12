package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    private List<Integer> testNumbers;

    @BeforeEach
    void setUp() {
        testNumbers = Arrays.asList(5, 4, 3, 1, 2);
    }

    @Test
    void testMin() {
        assertEquals(1, Main._min(testNumbers));
    }

    @Test
    void testMax() {
        assertEquals(5, Main._max(testNumbers));
    }

    @Test
    void testSum() {
        assertEquals(15, Main._sum(testNumbers));
    }

    @Test
    void testMult() {
        assertEquals(120, Main._mult(testNumbers));
    }

}