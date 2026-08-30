package arrays;

import java.util.HashMap;

//https://leetcode.com/problems/word-pattern
public class WordPattern {
    public static void main(String[] args) {

    }

    public boolean wordPattern(String pattern, String s) {
        char[] patternArray = pattern.toCharArray();
        HashMap<String, Character> patternMap = new HashMap<>();
        String[] sArray = s.split(" ");
        int pArrayLen = patternArray.length;
        int sArrayLen = sArray.length;
        if (pArrayLen != sArrayLen)
            return false;
        if (pArrayLen == 1)
            return true;

        for (int i = 0; i < sArray.length; i++) {
            if (patternMap.containsKey(sArray[i])) {
                if (patternArray[i] != patternMap.get(sArray[i])) {
                    return false;
                }
            } else if (patternMap.containsValue(patternArray[i])) {
                return false;
            } else {
                patternMap.put(sArray[i], patternArray[i]);
            }
        }
        return true;
    }
}
