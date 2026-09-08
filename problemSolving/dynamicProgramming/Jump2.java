package dynamicProgramming;

public class Jump2 {
    public static void main(String[] args) {

        System.out.println("\n" + jump(new int[]{1,2,3,4,5}));
        System.out.println("\n" + jump(new int[]{1,1,1,1,1}));
        System.out.println("\n" + jump(new int[]{2,3,1,1,4}));
    }

    public static int jump(int[] nums) {
        if (nums.length <= 1)
            return 0;

        int[] maxTarget = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            maxTarget[i] = nums[i] > 0 ? nums[i] + i : 0;
        }
        for(int num: maxTarget){
            System.out.print(num + " ");
        };
        int jumps = 1;
        int j = 0;
        while (j < nums.length - 1) {
            int maxReach = maxTarget[j];

            jumps++;

            int maxJumpIdx = j;
            for (int i = j; (i < maxReach) && (i <= nums.length - 1); i++) {
                System.out.println("JIndx -> "+ j + " MaxJumpIdx -> " + maxJumpIdx + " MaxTarget["+i+"] " + maxTarget[i] + " Jumps "+ jumps);
                maxJumpIdx = Math.max(maxJumpIdx, maxTarget[i]);
            }
            j = maxJumpIdx;
        }
        return jumps;
    }
}
