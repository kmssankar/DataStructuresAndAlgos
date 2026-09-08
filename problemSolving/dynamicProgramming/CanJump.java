package dynamicProgramming;

public class CanJump {
    public static void main(String[] args) {

    }

    public static boolean canJump(int[] nums) {
        if (nums.length == 0)
            return false;

        int[] maxTarget = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            maxTarget[i] = nums[i] + i;
        }
        int currPos = nums.length - 1;
        int j = nums.length - 2;
        while (j >= 0) {
            if (maxTarget[j] >= currPos) {
                currPos = j;
                j--;
            } else {
                j--;
            }
            if(currPos <= 0) break;
        }
        return currPos <= 0;
    }
}
