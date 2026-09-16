package backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    public static void main(String[] args) {

    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        result.add("");
        char[][] keysArray = new char[][] {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},
                {'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};

        char[] digitArray = digits.toCharArray();

        int initial = Integer.parseInt(digits.charAt(0)+"");

        for(int i = 0; i < digitArray.length; i++) {

            int currentKey = Integer.parseInt(digitArray[i]+"");

            char[] keyArray = keysArray[currentKey];
            List<String> tempResult = new ArrayList<>();
            for (int j = 0; j < keyArray.length; j++) {

                for(int k=0 ; k< result.size();k++) {
                    tempResult.add(result.get(k)+keyArray[j]);
                }

            }
            result = tempResult;
        }

        return result;
    }
}
