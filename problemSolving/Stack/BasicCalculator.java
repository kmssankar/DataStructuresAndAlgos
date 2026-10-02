package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/basic-calculator/?envType=study-plan-v2&envId=top-interview-150
public class BasicCalculator {

    public static void main(String[] args) {

        System.out.println(calculate("(1+(2+3)+(4+5))"));
        System.out.println(calculate("1-(     -2)"));
    }

    public static int calculate(String s) {

        Stack<Integer> stack = new Stack<>();
        int sign = 1;
        int result = 0;
        int number = 0;

        for (int i = 0; i < s.length(); i++) {
            System.out.println(" Stack "+ stack);

            Character c = s.charAt(i);
            number = 0;
            switch (c) {

                case Character dc when Character.isDigit(dc):

                    List<Character> list = new ArrayList<>();
                    int j;
                    for ( j = i; j < s.length(); j++) {
                        if (Character.isDigit(s.charAt(j))) {
                            list.add(s.charAt(j));
                        } else {
                            break;
                        }
                    }

                    int exponent = 0;
                    i = j - 1;
                    for (int k = list.size() - 1; k >= 0; k--) {
                        number += Integer.parseInt(list.get(k)+"") * ((int) Math.pow(10, exponent));
                        exponent++;
                    }
                    System.out.println(" Number : " + number);
                    result += number * sign;
                    sign =1;
                    break;

                case '(':
                    stack.push(result);
                    stack.push(sign);
                    result = 0;
                    sign = 1;
                    break;

                case ')':
                    System.out.println("Stack at ) " + stack);
                    int signToCalc = stack.pop();
                    int resultToCalc = stack.pop();
                    result += signToCalc * resultToCalc;
                    sign = 1;
                    break;

                case '-':
                    sign = sign * -1;
                    break;

                case '+':

                    sign =  sign;
                    break;

                default:
                    //System.out.println("Do Nothing");
                    break;
            }

        }
        return result;
    }
}
