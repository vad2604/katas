package ru.skillbox;

public class ReverseWords {

    private static String kataName = "https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java";

    public static String getKataName() {
        return kataName;
    }

    public static String reverseWords(final String original)
    {
        String reverse = "";
        String reversedWord = "";
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == ' ') {
                reversedWord = reversedWord + original.charAt(i);
                reverse = reverse + reversedWord;
                reversedWord = "";
            } else {
                reversedWord = original.charAt(i) + reversedWord;
            }
        }
        reverse = reverse + reversedWord;
        return reverse;
    }
}
