package arrays_and_strings;

import java.util.ArrayList;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        ArrayList<String> commonPrefix = new ArrayList<>();
        int lengthFirstWord = strs[0].length();
        int charIndex = 0;
        int numWords = strs.length;
        while (charIndex < lengthFirstWord) {
            char currChar = strs[0].charAt(charIndex);
            for (int i = 1; i < numWords; i++) {
                if (charIndex >= strs[i].length() || strs[i].charAt(charIndex) != currChar) {
                    return String.join("", commonPrefix);
                }
            }
            commonPrefix.add(Character.toString(currChar));
            charIndex++;
        }
        return String.join("", commonPrefix);
    }
}
