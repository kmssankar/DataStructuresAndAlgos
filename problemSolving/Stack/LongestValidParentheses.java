package Stack;

import java.util.Stack;

public class LongestValidParentheses {

    public static void main(String[] args) {

    }


    public static int longestValidParentheses(String s) {

        int max = 0;
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        int currentCount = 0;
        for (char aChar : chars) {

            if (aChar == '(') {
                stack.push('(');
            } else {
                if (!stack.isEmpty()) {
                    char pop = stack.pop();
                    if (pop == '(') {
                        currentCount = currentCount + 2;
                    } else {
                        if (currentCount > max) {
                            max = currentCount;
                        }
                        currentCount = 0;
                        stack.empty();

                    }
                } else {
                    if (currentCount > max) {
                        max = currentCount;
                    }
                    currentCount = 0;
                    stack.empty();
                }
            }
        }

        if (!stack.isEmpty()) {
            currentCount = currentCount - 2;

        }
        if (currentCount > max) {
            max = currentCount;
        }
        return max;
    }
}
