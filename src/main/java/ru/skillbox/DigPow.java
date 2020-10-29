package ru.skillbox;

import java.util.ArrayList;
import java.util.List;

public class DigPow {

    private static String kataName = "https://www.codewars.com/kata/5552101f47fc5178b1000050/train/java";

    public static String getKataName() {
        return kataName;
    }

    public static long digPow(int n, int p) {
        List<Integer> digits = new ArrayList<>();
        int m = n;
        while (m > 0) {
            digits.add(m % 10);
            m /= 10;
        }
        long sum = 0;
        for (int i = digits.size() - 1; i >= 0; i--) {
            long resultToCheck = (long) Math.pow(digits.get(i), p);
            sum += resultToCheck;
            p++;
        }
        if (sum % n == 0) {
            return sum / n;
        }
        return -1;
    }

}
