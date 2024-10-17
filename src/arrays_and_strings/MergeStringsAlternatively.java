package arrays_and_strings;

public class MergeStringsAlternatively {
    public String mergeAlternately(String word1, String word2) {
        int word1Len = word1.length();
        int word2Len = word2.length();
        int p = 0;
        StringBuilder res = new StringBuilder();
        while (p < word1Len && p < word2Len) {
            res.append(Character.toString(word1.charAt(p))).append(Character.toString(word2.charAt(p)));
            p++;
        }
        return res + word1.substring(p) + word2.substring(p);

    }
}
