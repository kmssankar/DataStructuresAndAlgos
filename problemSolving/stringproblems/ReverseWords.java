package stringproblems;

import java.util.Arrays;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(reverseWords(" this is   not working ") + "--");
    }

    public static String reverseWords(String s) {

        String[] inpArray = s.split(" ");
        StringBuilder str = new StringBuilder(s .length()   );
        for (String inpArray2 : inpArray) {
            if (inpArray2.trim().length() > 0)
                str.insert(0, inpArray2 + " ");
        }

        return str.toString().trim();

    }
}
