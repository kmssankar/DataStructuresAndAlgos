package stringproblems;

public class ValidPalindromeString {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(String s) {    
        String lowerCaseString = s.toLowerCase();
        char[] charArr = lowerCaseString.toCharArray();
        int startIdx = 0, endIdx = charArr.length - 1;
        while (startIdx < endIdx) {
            if (!((charArr[startIdx] >= 'a' && charArr[startIdx] <= 'z' ) || (charArr[startIdx] >= '0' && charArr[startIdx] <= '9' ))) {
                startIdx++;
                continue;
            }
             if (!((charArr[endIdx] >= 'a' && charArr[endIdx] <= 'z' ) || (charArr[endIdx] >= '0' && charArr[endIdx] <= '9' ))) {
                endIdx--;
                continue;
            }
            if (charArr[startIdx] != charArr[endIdx]) {
                return false;
            }
            startIdx++;
            endIdx--;
        }
        return true;
    }

}
