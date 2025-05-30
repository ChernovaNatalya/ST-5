package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {

    private final double inaccuracy = 1e-4;

    @Test
    void shouldCalculateSquareRootOfZero() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(0.0, sqrt.calc(), inaccuracy);
    }

    @Test
    void shouldCalculateSquareRootOfOne() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.calc(), inaccuracy);
    }

    @Test
    void shouldCalculateSquareRootOfNine() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), inaccuracy);
    }

    @Test
    void shouldCalculateSquareRootOfFraction() {
        Sqrt sqrt = new Sqrt(0.25);
        assertEquals(0.5, sqrt.calc(), inaccuracy);
    }

    @Test
    void shouldCalculateSquareRootOfIrrationalNumber() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2), sqrt.calc(), inaccuracy);
    }

    @Test
    void shouldCalculateSquareRootOfLargeNumber() {
        Sqrt sqrt = new Sqrt(1e6);
        assertEquals(1000.0, sqrt.calc(), inaccuracy);
    }

    @Test
    void shouldCalculateSquareRootOfVerySmallNumber() {
        Sqrt sqrt = new Sqrt(1e-10);
        assertEquals(1e-5, sqrt.calc(), inaccuracy);
    }

    @Test
    void shouldThrowOnNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {Sqrt sqrt = new Sqrt(-1.0);});
    }
@Test
    void shouldCalculateSquareRootSixteen() {
        Sqrt sqrt = new Sqrt(16);
        assertEquals(4, sqrt.calc(), inaccuracy);
    }
@Test
    void shouldCalculateSquareRootOfFive() {
        Sqrt sqrt = new Sqrt(5);
        assertEquals(Math.sqrt(5), sqrt.calc(), inaccuracy);
    }
    @Test
    void shouldCalculateSquareRootOfHundred() {
        Sqrt sqrt = new Sqrt(100);
        assertEquals(10, sqrt.calc(), inaccuracy);
    }

    }
