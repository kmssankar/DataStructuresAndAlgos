package arrays;

public class minSubArrayLen {

    public static void main(String[] args) {
        System.out.println( minSubArrayLen(4,new int[]{1,4,4}));
    }

      public static int minSubArrayLen(int target, int[] nums) {
       int minLen = Integer.MAX_VALUE;

        int numsLength = nums.length;
        int startIdx = 0, endIdx = 0;
        int runningSum = nums[0];
          int subArrayLen = 0;

        while (startIdx <= numsLength - 1 && endIdx < numsLength - 1) {
            System.out.println("startIdx - "+ startIdx+ " endIdx- "+endIdx+ " Running Sum " + runningSum);
            if (runningSum >= target) {

                subArrayLen = endIdx - startIdx;
                if (subArrayLen < minLen) {
                    minLen = subArrayLen;
                }
                runningSum = runningSum - nums[startIdx];
                startIdx++;

            }else{
                System.out.println("else runningSum - "+runningSum);
                endIdx++;
                runningSum = runningSum + nums[endIdx];
            }


        }

        if(runningSum > target){
            subArrayLen = endIdx - startIdx;
            if(subArrayLen < minLen){
                minLen = subArrayLen;
            }
        }

        return minLen + 1;

    }
}
