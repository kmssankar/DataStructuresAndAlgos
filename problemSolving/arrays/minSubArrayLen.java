package arrays;

public class minSubArrayLen {

    public static void main(String[] args) {
        
    }

      public int minSubArrayLen(int target, int[] nums) {
       int minLen = Integer.MAX_VALUE;

        int numsLength = nums.length;
        int startIdx = 0, endIdx = 0;
        int runningSum = 0;

        for (int i = 0; i < numsLength; i++) {

            if (runningSum >= target) {
                int subArrayLen = endIdx - startIdx;
                if (subArrayLen < minLen) {
                    minLen = subArrayLen;
                }
                runningSum = runningSum - nums[startIdx];
                startIdx++;
            }
            runningSum = runningSum + nums[i];
            System.out.println("startIdx - "+ startIdx+ " endIdx- "+endIdx+ " Running Sum " + runningSum);
            endIdx = i;
        }

        return minLen;

    }
}
