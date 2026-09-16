package arrays;
/*
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
*/

public class Zigzagconv {

    public static void main(String[] args) {

    }

    public static String convert(String s, int numRows) {

        if (numRows >= s.length() || numRows == 1) {
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        char[] chars = s.toCharArray();
        enum direction {
            UP,
            DOWN,
        }
        direction flow = direction.DOWN;
        int row = 0;
        for (char aChar : chars) {
            rows[row].append(aChar);

            if (flow == direction.DOWN) {
                row++;
            } else {
                row--;
            }

            if ((row == numRows - 1) || (row == 0)) {
                if (flow == direction.UP) {
                    flow = direction.DOWN;
                } else {
                    flow = direction.UP;
                }
            }
        }
        int i = 0;
        for (StringBuilder str : rows) {
            if (i > 0) {
                rows[0].append(str);
            }
            i++;
        }
        return rows[0].toString();
    }
}

