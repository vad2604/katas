package ru.skillbox;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsTest {

    @Test
    public void tests() {
        assertEquals("olleH tseT !dlroW", ReverseWords.reverseWords("Hello Test World!"));
        assertEquals("double  triple   space    ", ReverseWords.reverseWords("elbuod  elpirt   ecaps    "));
        assertEquals("l e t t e r s", ReverseWords.reverseWords("l e t t e r s"));
        assertEquals("https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java", ReverseWords.getKataName());
    }
}
