package ru.skillbox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigPowTest {

    @Test
    public void tests() {
        assertEquals(2, DigPow.digPow(695, 2));
        assertEquals(-1, DigPow.digPow(34, 1));
        assertEquals(51, DigPow.digPow(46288, 3));
        assertEquals("https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java", DigPow.getKataName());
    }
}
