package arrays;

public class SortedSquare {

    public static void main(String[] args) {

    }

    public static int[] sortedSquares(int[] nums) {
        int[] out = new int[nums.length];
        int outindex = nums.length - 1;
        int startIndex = 0, endIndex = nums.length - 1;

        while (startIndex < endIndex) {
            if (Math.abs(nums[startIndex]) > Math.abs(nums[endIndex])) {
                out[outindex] = nums[startIndex] * nums[startIndex];
                startIndex++;
            } else {
                out[outindex] = nums[endIndex] * nums[endIndex];
                endIndex--;
            }
            outindex--;

        }

        return out;
    }
}
