package arrays;

import java.util.Arrays;

public class minSubArrayLen {

    public static void main(String[] args) {
        System.out.println( minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }

      public static int minSubArrayLen(int target, int[] nums) {
       int minLen = Integer.MAX_VALUE;

        int numsLength = nums.length;
        int startIdx = 0, endIdx = 0;
        int[] prefixSums = new int[numsLength + 1];
        Arrays.fill(prefixSums, 0);

        for (int i = 1; i <= numsLength; i++) {
            prefixSums[i] = prefixSums[i - 1] + nums[i - 1];
        }

          System.out.println(Arrays.toString(prefixSums));
        int mid = -1;
        int firstIndex = -1;

        for(int i = 0; i < numsLength; i++){

            startIdx = i;
            endIdx =  numsLength;

            while(startIdx < endIdx){




            }



        }


        return minLen + 1;

    }
}
