package ru.skillbox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WhichAreInTest {

    @Test
    public void test1() {
        String[] first = new String[] {"if", "tt", "ya"};
        String[] second = new String[]{"life", "is", "better"};
        assertArrayEquals(new String[]{"if", "tt"}, WhichAreIn.inArray(first, second));
    }

    @Test
    public void test2() {
        String[] first = new String[]{"life", "is", "better"};
        String[] second = new String[] {"if", "tt", "ya"};
        assertArrayEquals(new String[]{}, WhichAreIn.inArray(first, second));
    }

    @Test
    public void test3() {
        String[] first = new String[] {"if", "tt", "ya", "if", "ya", "tt"};
        String[] second = new String[]{"life", "is", "better", "that", "life"};
        assertArrayEquals(new String[]{"if", "tt"}, WhichAreIn.inArray(first, second));
    }

    @Test
    public void linkTest() {
        assertEquals("https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java", WhichAreIn.getKataName());
    }






}
