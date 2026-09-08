package greedy;

import java.util.Arrays;

public class Candy {
    //https://leetcode.com/problems/candy/
    public static void main(String[] args) {

    }

    public int candy(int[] ratings) {

        int[] forwardArray = new int[ratings.length];
        int[] reversedArray = new int[ratings.length];
        int sum = 0;
        Arrays.fill(forwardArray, 1);
        Arrays.fill(reversedArray, 1);
        int arrayLength = ratings.length;

        for(int i =1;i<arrayLength;i++) {
            if(ratings[i]> ratings[i-1]) {
                forwardArray[i] = forwardArray[i-1] + 1;
            }
            if(ratings[arrayLength - i - 1] > ratings[arrayLength - i]) {
                reversedArray[arrayLength - i - 1] = reversedArray[arrayLength - i] + 1;
            }

        }

        for(int i =0;i<arrayLength;i++) {
            int indexmax = Math.max(forwardArray[i], reversedArray[i]);
            sum = sum + indexmax;
        }
        return sum;
    }
}
