package arrays_and_strings;

import java.util.Map;

import static java.util.Map.entry;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanNumerals = Map.ofEntries(
                entry('I', 1),
                entry('V', 5),
                entry('X', 10),
                entry('L', 50),
                entry('C', 100),
                entry('D', 500),
                entry('M', 1000)
        );

        int start = s.length() - 1;
        int number = 0;
        int prevNum = 0;

        for (int i = start; i >= 0; i--) {
            int currNum = romanNumerals.get(s.charAt(i));
            if (currNum >= prevNum) {
                number += currNum;
            } else {
                number -= currNum;
            }
            prevNum = currNum;
        }

        return number;
    }
}
