package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static void main(String[] args) {

        System.out.println((int) 'a' + " " + (int) 'A');
        System.out.println(minWindow("A", "A"));
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }


    public static String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        if (s.length() == 1) {
            return t.equals(s) ? t : "";
        }

        char[] stringArray = s.toCharArray();
        char[] patternArray = t.toCharArray();
        Map<Character, Integer> templateMap = new HashMap<>();
        Map<Character, Integer> substringMap = new HashMap<>();
        int[] subStringIdx = new int[52];
        int[] templateIdx = new int[52];
        Arrays.fill(templateIdx, 0);
        Arrays.fill(subStringIdx, 0);

        for (char c : patternArray) {
            updateMapIdx(templateIdx,c,true);
        }
        int start = 0;
        int end = 1;
        int minSubstringLength = Integer.MAX_VALUE;
        String substring = "";
        boolean endReached = false;
        updateMapIdx(subStringIdx,stringArray[0],true);
        while (start < end && (!endReached)) {
            System.out.println("start " + start + " end " + end + " " + s.substring(start, end));
            if (isSubstringFormed(templateIdx, subStringIdx)) {
                System.out.println(">>>Substring formed ==> " + s.substring(start, end));
                int currentSubstringLength = end - start;
                if (currentSubstringLength < minSubstringLength) {
                    minSubstringLength = currentSubstringLength;
                    substring = s.substring(start, end);
                }
                updateMapIdx(subStringIdx,stringArray[start],false);
                substringMap.put(stringArray[start], substringMap.getOrDefault(stringArray[start], 0) - 1);
                start++;
            } else {

                if (end < stringArray.length) {
                    updateMapIdx(subStringIdx,stringArray[end],true);
                    end++;
                } else {
                    endReached = true;
                }
            }
        }
        return substring;
    }

    private static boolean isSubstringFormed(Map<Character, Integer> templateMap, Map<Character, Integer> substrMap) {
        for (Map.Entry<Character, Integer> entry : templateMap.entrySet()) {
            if (substrMap.containsKey(entry.getKey())) {
                if (substrMap.get(entry.getKey()) < entry.getValue()) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean isSubstringFormed(int[] template, int[] substring) {
        for(int i = 0; i < substring.length; i++) {
            if (substring[i] < template[i]) {
                return false;
            }
        }
        return true;
    }

    private static void updateMapIdx( int[] map , char character, boolean increment){
        if((int)(character) > 96){
            int oldValue = map[(int)(character) - 96];
            if(increment) {
                map[(int) (character) - 96] = oldValue + 1;
            }
            else{
                map[(int) (character) - 96] = oldValue - 1;
            }
        } else  {
            int oldValue = map[(int)(character) - 64];
            map[(int)(character) - 64] = oldValue + 1;
            if(increment) {
                map[(int) (character) - 64] = oldValue + 1;
            }
            else{
                map[(int) (character) - 64] = oldValue - 1;
            }
        }
    }
}
