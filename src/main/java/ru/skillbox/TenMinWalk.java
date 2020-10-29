package ru.skillbox;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TenMinWalk {

    private static String kataName = "https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java";

    public static String getKataName() {
        return kataName;
    }

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        Map<Character, List<Character>> routeMap = IntStream.range(0, walk.length)
                .mapToObj(i -> walk[i])
                .collect(Collectors.groupingBy(Character::charValue));
        return getSizeOfDirection(routeMap, 'n') == getSizeOfDirection(routeMap,'s')
                && getSizeOfDirection(routeMap, 'w') == getSizeOfDirection(routeMap, 'e');
    }

    private static int getSizeOfDirection(Map<Character, List<Character>> routeMap, char directionCode) {
        return Optional.ofNullable(routeMap.get(directionCode))
                .map(List::size)
                .orElse(0);
    }
}
