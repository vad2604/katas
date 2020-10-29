package ru.skillbox;

import java.util.Set;
import java.util.TreeSet;

public class WhichAreIn {

    private static String kataName = "https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java";

    public static String getKataName() {
        return kataName;
    }

    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> result = new TreeSet<>();
        for (String subStringCandidate : array1) {
            for (String strToCheck : array2) {
                if (!strToCheck.replaceAll(subStringCandidate, "").equals(strToCheck)) {
                    result.add(subStringCandidate);
                }
            }
        }
        return result.toArray(new String[0]);	}
}
