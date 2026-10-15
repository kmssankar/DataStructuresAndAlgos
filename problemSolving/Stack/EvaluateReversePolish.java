package Stack;

import java.util.Stack;

public class EvaluateReversePolish {

    public static void main(String[] args) {

    }

    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            switch (token) {

                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-":
                    stack.push(stack.pop() - stack.pop());
                    break;

                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/":
                    stack.push((1/stack.pop()) * stack.pop());
                    break;

                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }

        }

        return stack.peek();

    }
}
