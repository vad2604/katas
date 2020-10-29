package ru.skillbox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TenMinWalkTest {

    @Test
    public void tests() {
        assertEquals(true, TenMinWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        assertEquals(false, TenMinWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e','w'}));
        assertEquals(true, TenMinWalk.isValid(new char[]{'w', 'e', 's', 'n', 'w', 'e', 's', 'n', 'w', 'e'}));
        assertEquals(false, TenMinWalk.isValid(new char[]{'w'}));
        assertEquals("https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java", TenMinWalk.getKataName());
    }


}
